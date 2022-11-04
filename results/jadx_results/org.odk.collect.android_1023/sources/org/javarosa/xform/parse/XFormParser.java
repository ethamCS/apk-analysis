package org.javarosa.xform.parse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import org.javarosa.core.model.Constants;
import org.javarosa.core.model.DataBinding;
import org.javarosa.core.model.FormDef;
import org.javarosa.core.model.GroupDef;
import org.javarosa.core.model.IDataReference;
import org.javarosa.core.model.IFormElement;
import org.javarosa.core.model.ItemsetBinding;
import org.javarosa.core.model.QuestionDef;
import org.javarosa.core.model.SelectChoice;
import org.javarosa.core.model.SubmissionProfile;
import org.javarosa.core.model.condition.Condition;
import org.javarosa.core.model.condition.Constraint;
import org.javarosa.core.model.condition.EvaluationContext;
import org.javarosa.core.model.condition.Recalculate;
import org.javarosa.core.model.condition.Triggerable;
import org.javarosa.core.model.instance.FormInstance;
import org.javarosa.core.model.instance.InvalidReferenceException;
import org.javarosa.core.model.instance.TreeElement;
import org.javarosa.core.model.instance.TreeReference;
import org.javarosa.core.model.util.restorable.Restorable;
import org.javarosa.core.model.util.restorable.RestoreUtils;
import org.javarosa.core.services.Logger;
import org.javarosa.core.services.locale.Localizer;
import org.javarosa.core.services.locale.TableLocaleSource;
import org.javarosa.core.util.externalizable.PrototypeFactory;
import org.javarosa.core.util.externalizable.PrototypeFactoryDeprecated;
import org.javarosa.form.api.FormEntryCaption;
import org.javarosa.model.xform.XPathReference;
import org.javarosa.xform.util.XFormAnswerDataParser;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.javarosa.xform.util.XFormSerializer;
import org.javarosa.xform.util.XFormUtils;
import org.javarosa.xpath.XPathConditional;
import org.javarosa.xpath.expr.XPathPathExpr;
import org.javarosa.xpath.parser.XPathSyntaxException;
import org.kxml2.io.KXmlParser;
import org.kxml2.kdom.Document;
import org.kxml2.kdom.Element;
import org.kxml2.kdom.Node;
import org.odk.collect.android.utilities.FileUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class XFormParser {
    private static final String APPEARANCE_ATTR = "appearance";
    private static final String BIND_ATTR = "bind";
    private static final int CONTAINER_GROUP = 1;
    private static final int CONTAINER_REPEAT = 2;
    private static final String FORM_ATTR = "form";
    private static final String ID_ATTR = "id";
    private static final String ITEXT_CLOSE = "')";
    private static final String ITEXT_OPEN = "jr:itext('";
    private static final String LABEL_ELEMENT = "label";
    public static final String NAMESPACE_HTML = "http://www.w3.org/1999/xhtml";
    public static final String NAMESPACE_JAVAROSA = "http://openrosa.org/javarosa";
    private static final String NODESET_ATTR = "nodeset";
    private static final String REF_ATTR = "ref";
    private static final String SELECT = "select";
    private static final String SELECTONE = "select1";
    private static final String VALUE = "value";
    private static Hashtable<String, IElementHandler> groupLevelHandlers;
    private static PrototypeFactoryDeprecated modelPrototypes;
    private static Vector<SubmissionParser> submissionParsers;
    private static Hashtable<String, IElementHandler> topLevelHandlers;
    private static Hashtable<String, Integer> typeMappings;
    private FormDef _f;
    private Document _instDoc;
    private Reader _instReader;
    private Reader _reader;
    private Document _xmldoc;
    private Vector<DataBinding> bindings;
    private Hashtable<String, DataBinding> bindingsByID;
    private String defaultNamespace;
    private Vector<String> instanceNodeIdStrs;
    private Vector<Element> instanceNodes;
    private Vector<ItemsetBinding> itemsets;
    private Vector<String> itextKnownForms;
    private Element mainInstanceNode;
    private boolean modelFound;
    private FormInstance repeatTree;
    private Vector<TreeReference> repeats;
    private Vector<TreeReference> selectMultis;
    private Vector<TreeReference> selectOnes;
    private int serialQuestionID = 1;

    static {
        try {
            staticInit();
        } catch (Exception e) {
            Logger.die("xfparser-static-init", e);
        }
    }

    private static void staticInit() {
        initProcessingRules();
        initTypeMappings();
        modelPrototypes = new PrototypeFactoryDeprecated();
        submissionParsers = new Vector<>();
    }

    private static void initProcessingRules() {
        IElementHandler iElementHandler = new IElementHandler() { // from class: org.javarosa.xform.parse.XFormParser.1
            @Override // org.javarosa.xform.parse.IElementHandler
            public void handle(XFormParser xFormParser, Element element, Object obj) {
                xFormParser.parseTitle(element);
            }
        };
        IElementHandler iElementHandler2 = new IElementHandler() { // from class: org.javarosa.xform.parse.XFormParser.2
            @Override // org.javarosa.xform.parse.IElementHandler
            public void handle(XFormParser xFormParser, Element element, Object obj) {
                xFormParser.parseMeta(element);
            }
        };
        IElementHandler iElementHandler3 = new IElementHandler() { // from class: org.javarosa.xform.parse.XFormParser.3
            @Override // org.javarosa.xform.parse.IElementHandler
            public void handle(XFormParser xFormParser, Element element, Object obj) {
                xFormParser.parseModel(element);
            }
        };
        IElementHandler iElementHandler4 = new IElementHandler() { // from class: org.javarosa.xform.parse.XFormParser.4
            @Override // org.javarosa.xform.parse.IElementHandler
            public void handle(XFormParser xFormParser, Element element, Object obj) {
                xFormParser.parseControl((IFormElement) obj, element, 1);
            }
        };
        IElementHandler iElementHandler5 = new IElementHandler() { // from class: org.javarosa.xform.parse.XFormParser.5
            @Override // org.javarosa.xform.parse.IElementHandler
            public void handle(XFormParser xFormParser, Element element, Object obj) {
                xFormParser.parseControl((IFormElement) obj, element, 5);
            }
        };
        IElementHandler iElementHandler6 = new IElementHandler() { // from class: org.javarosa.xform.parse.XFormParser.6
            @Override // org.javarosa.xform.parse.IElementHandler
            public void handle(XFormParser xFormParser, Element element, Object obj) {
                xFormParser.parseControl((IFormElement) obj, element, 3);
            }
        };
        IElementHandler iElementHandler7 = new IElementHandler() { // from class: org.javarosa.xform.parse.XFormParser.7
            @Override // org.javarosa.xform.parse.IElementHandler
            public void handle(XFormParser xFormParser, Element element, Object obj) {
                xFormParser.parseControl((IFormElement) obj, element, 2);
            }
        };
        IElementHandler iElementHandler8 = new IElementHandler() { // from class: org.javarosa.xform.parse.XFormParser.8
            @Override // org.javarosa.xform.parse.IElementHandler
            public void handle(XFormParser xFormParser, Element element, Object obj) {
                xFormParser.parseGroup((IFormElement) obj, element, 1);
            }
        };
        IElementHandler iElementHandler9 = new IElementHandler() { // from class: org.javarosa.xform.parse.XFormParser.9
            @Override // org.javarosa.xform.parse.IElementHandler
            public void handle(XFormParser xFormParser, Element element, Object obj) {
                xFormParser.parseGroup((IFormElement) obj, element, 2);
            }
        };
        IElementHandler iElementHandler10 = new IElementHandler() { // from class: org.javarosa.xform.parse.XFormParser.10
            @Override // org.javarosa.xform.parse.IElementHandler
            public void handle(XFormParser xFormParser, Element element, Object obj) {
                xFormParser.parseGroupLabel((GroupDef) obj, element);
            }
        };
        IElementHandler iElementHandler11 = new IElementHandler() { // from class: org.javarosa.xform.parse.XFormParser.11
            @Override // org.javarosa.xform.parse.IElementHandler
            public void handle(XFormParser xFormParser, Element element, Object obj) {
                xFormParser.parseControl((IFormElement) obj, element, 9);
            }
        };
        IElementHandler iElementHandler12 = new IElementHandler() { // from class: org.javarosa.xform.parse.XFormParser.12
            @Override // org.javarosa.xform.parse.IElementHandler
            public void handle(XFormParser xFormParser, Element element, Object obj) {
                xFormParser.parseUpload((IFormElement) obj, element, 7);
            }
        };
        groupLevelHandlers = new Hashtable<>();
        groupLevelHandlers.put("input", iElementHandler4);
        groupLevelHandlers.put("secret", iElementHandler5);
        groupLevelHandlers.put(SELECT, iElementHandler6);
        groupLevelHandlers.put(SELECTONE, iElementHandler7);
        groupLevelHandlers.put("group", iElementHandler8);
        groupLevelHandlers.put("repeat", iElementHandler9);
        groupLevelHandlers.put("trigger", iElementHandler11);
        groupLevelHandlers.put(Constants.XFTAG_UPLOAD, iElementHandler12);
        topLevelHandlers = new Hashtable<>();
        Enumeration<String> keys = groupLevelHandlers.keys();
        while (keys.hasMoreElements()) {
            String nextElement = keys.nextElement();
            topLevelHandlers.put(nextElement, groupLevelHandlers.get(nextElement));
        }
        topLevelHandlers.put("model", iElementHandler3);
        topLevelHandlers.put(FileUtils.TITLE, iElementHandler);
        topLevelHandlers.put("meta", iElementHandler2);
        groupLevelHandlers.put(LABEL_ELEMENT, iElementHandler10);
    }

    private static void initTypeMappings() {
        typeMappings = new Hashtable<>();
        typeMappings.put("string", new Integer(1));
        typeMappings.put("integer", new Integer(2));
        typeMappings.put(FormEntryCaption.TEXT_FORM_LONG, new Integer(13));
        typeMappings.put("int", new Integer(2));
        typeMappings.put("decimal", new Integer(3));
        typeMappings.put("double", new Integer(3));
        typeMappings.put("float", new Integer(3));
        typeMappings.put("dateTime", new Integer(6));
        typeMappings.put("date", new Integer(4));
        typeMappings.put("time", new Integer(5));
        typeMappings.put("gYear", new Integer(-1));
        typeMappings.put("gMonth", new Integer(-1));
        typeMappings.put("gDay", new Integer(-1));
        typeMappings.put("gYearMonth", new Integer(-1));
        typeMappings.put("gMonthDay", new Integer(-1));
        typeMappings.put("boolean", new Integer(9));
        typeMappings.put("base64Binary", new Integer(-1));
        typeMappings.put("hexBinary", new Integer(-1));
        typeMappings.put("anyURI", new Integer(-1));
        typeMappings.put("listItem", new Integer(7));
        typeMappings.put("listItems", new Integer(8));
        typeMappings.put(SELECTONE, new Integer(7));
        typeMappings.put(SELECT, new Integer(8));
        typeMappings.put("geopoint", new Integer(10));
        typeMappings.put("barcode", new Integer(11));
        typeMappings.put("binary", new Integer(12));
    }

    private void initState() {
        this.modelFound = false;
        this.bindingsByID = new Hashtable<>();
        this.bindings = new Vector<>();
        this.repeats = new Vector<>();
        this.itemsets = new Vector<>();
        this.selectOnes = new Vector<>();
        this.selectMultis = new Vector<>();
        this.mainInstanceNode = null;
        this.instanceNodes = new Vector<>();
        this.instanceNodeIdStrs = new Vector<>();
        this.repeatTree = null;
        this.defaultNamespace = null;
        this.itextKnownForms = new Vector<>();
        this.itextKnownForms.addElement(FormEntryCaption.TEXT_FORM_LONG);
        this.itextKnownForms.addElement(FormEntryCaption.TEXT_FORM_SHORT);
        this.itextKnownForms.addElement(FormEntryCaption.TEXT_FORM_IMAGE);
        this.itextKnownForms.addElement(FormEntryCaption.TEXT_FORM_AUDIO);
    }

    public XFormParser(Reader reader) {
        this._reader = reader;
    }

    public XFormParser(Document document) {
        this._xmldoc = document;
    }

    public XFormParser(Reader reader, Reader reader2) {
        this._reader = reader;
        this._instReader = reader2;
    }

    public XFormParser(Document document, Document document2) {
        this._xmldoc = document;
        this._instDoc = document2;
    }

    public FormDef parse() {
        if (this._f == null) {
            System.out.println("Parsing form...");
            if (this._xmldoc == null) {
                this._xmldoc = getXMLDocument(this._reader);
            }
            parseDoc();
            if (this._instReader != null) {
                loadXmlInstance(this._f, this._instReader);
            } else if (this._instDoc != null) {
                loadXmlInstance(this._f, this._instDoc);
            }
        }
        return this._f;
    }

    public static Document getXMLDocument(Reader reader) {
        Document document = new Document();
        try {
            KXmlParser kXmlParser = new KXmlParser();
            kXmlParser.setInput(reader);
            kXmlParser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, true);
            document.parse(kXmlParser);
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Error closing reader");
                e.printStackTrace();
            }
            return document;
        } catch (XmlPullParserException e2) {
            String str = "XML Syntax Error at Line: " + e2.getLineNumber() + ", Column: " + e2.getColumnNumber() + "!";
            System.err.println(str);
            e2.printStackTrace();
            throw new XFormParseException(str);
        } catch (Exception e3) {
            System.err.println("Unhandled Exception while Parsing XForm");
            e3.printStackTrace();
            throw new XFormParseException("Unhandled Exception while Parsing XForm");
        }
    }

    private void parseDoc() {
        this._f = new FormDef();
        initState();
        this.defaultNamespace = this._xmldoc.getRootElement().getNamespaceUri((String) null);
        parseElement(this._xmldoc.getRootElement(), this._f, topLevelHandlers);
        collapseRepeatGroups(this._f);
        if (this.instanceNodes.size() > 1) {
            for (int i = 1; i < this.instanceNodes.size(); i++) {
                Element elementAt = this.instanceNodes.elementAt(i);
                FormInstance parseInstance = parseInstance(elementAt, false);
                loadInstanceData(elementAt, parseInstance.getRoot(), this._f);
                this._f.addNonMainInstance(parseInstance);
            }
        }
        if (this.mainInstanceNode != null) {
            FormInstance parseInstance2 = parseInstance(this.mainInstanceNode, true);
            addMainInstanceToFormDef(this.mainInstanceNode, parseInstance2);
            this._f.setInstance(parseInstance2);
        }
    }

    private void parseElement(Element element, Object obj, Hashtable<String, IElementHandler> hashtable) {
        String name = element.getName();
        Vector vector = new Vector();
        for (String str : new String[]{"html", "head", "body", "xform", "chooseCaption", "addCaption", "addEmptyCaption", "delCaption", "doneCaption", "doneEmptyCaption", "mainHeader", "entryHeader", "delHeader"}) {
            vector.addElement(str);
        }
        IElementHandler iElementHandler = hashtable.get(name);
        if (iElementHandler != null) {
            iElementHandler.handle(this, element, obj);
            return;
        }
        if (!vector.contains(name)) {
            System.err.println("XForm Parse: Unrecognized element [" + name + "]. Ignoring and processing children..." + getVagueLocation(element));
        }
        for (int i = 0; i < element.getChildCount(); i++) {
            if (element.getType(i) == 2) {
                parseElement(element.getElement(i), obj, hashtable);
            }
        }
    }

    public void parseTitle(Element element) {
        Vector vector = new Vector();
        String xMLText = getXMLText(element, true);
        System.out.println("Title: \"" + xMLText + "\"");
        this._f.setTitle(xMLText);
        if (this._f.getName() == null) {
            this._f.setName(xMLText);
        }
        if (XFormUtils.showUnusedAttributeWarning(element, vector)) {
            System.out.println(XFormUtils.unusedAttWarning(element, vector));
        }
    }

    public void parseMeta(Element element) {
        Vector vector = new Vector();
        int attributeCount = element.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = element.getAttributeName(i);
            String attributeValue = element.getAttributeValue(i);
            if ("name".equals(attributeName)) {
                this._f.setName(attributeValue);
            }
        }
        vector.addElement("name");
        if (XFormUtils.showUnusedAttributeWarning(element, vector)) {
            System.out.println(XFormUtils.unusedAttWarning(element, vector));
        }
    }

    public void parseModel(Element element) {
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        if (this.modelFound) {
            System.err.println("Multiple models not supported. Ignoring subsequent models." + getVagueLocation(element));
            return;
        }
        this.modelFound = true;
        if (XFormUtils.showUnusedAttributeWarning(element, vector)) {
            System.out.println(XFormUtils.unusedAttWarning(element, vector));
        }
        int i = 0;
        while (i < element.getChildCount()) {
            int type = element.getType(i);
            Element element2 = type == 2 ? element.getElement(i) : null;
            String name = element2 != null ? element2.getName() : null;
            if ("itext".equals(name)) {
                parseIText(element2);
            } else if ("instance".equals(name)) {
                saveInstanceNode(element2);
            } else if (BIND_ATTR.equals(name)) {
                parseBind(element2);
            } else if (FileUtils.SUBMISSIONURI.equals(name)) {
                vector2.addElement(element2);
            } else if (type == 2) {
                throw new XFormParseException("Unrecognized top-level tag [" + name + "] found within <model>", element2);
            } else {
                if (type == 4 && getXMLText(element, i, true).length() != 0) {
                    throw new XFormParseException("Unrecognized text content found within <model>: \"" + getXMLText(element, i, true) + "\"", element2);
                }
            }
            if (element2 == null || BIND_ATTR.equals(name) || "itext".equals(name)) {
                element.removeChild(i);
                i--;
            }
            i++;
        }
        Iterator it = vector2.iterator();
        while (it.hasNext()) {
            parseSubmission((Element) it.next());
        }
    }

    private void parseSubmission(Element element) {
        SubmissionParser submissionParser;
        XPathReference xPathReference;
        boolean z;
        String attributeValue = element.getAttributeValue(null, ID_ATTR);
        String attributeValue2 = element.getAttributeValue(null, "method");
        String attributeValue3 = element.getAttributeValue(null, "action");
        SubmissionParser submissionParser2 = new SubmissionParser();
        Iterator<SubmissionParser> it = submissionParsers.iterator();
        while (true) {
            submissionParser = submissionParser2;
            if (!it.hasNext()) {
                break;
            }
            submissionParser2 = it.next();
            if (!submissionParser2.matchesCustomMethod(attributeValue2)) {
                submissionParser2 = submissionParser;
            }
        }
        String attributeValue4 = element.getAttributeValue(null, REF_ATTR);
        String attributeValue5 = element.getAttributeValue(null, BIND_ATTR);
        if (attributeValue5 != null) {
            DataBinding dataBinding = this.bindingsByID.get(attributeValue5);
            if (dataBinding == null) {
                throw new XFormParseException("XForm Parse: invalid binding ID in submit'" + attributeValue5 + "'", element);
            }
            xPathReference = dataBinding.getReference();
            z = true;
        } else if (attributeValue4 != null) {
            xPathReference = new XPathReference(attributeValue4);
            z = false;
        } else {
            xPathReference = new XPathReference("/");
            z = false;
        }
        if (xPathReference != null && !z) {
            xPathReference = getAbsRef(xPathReference, TreeReference.rootRef());
        }
        SubmissionProfile parseSubmission = submissionParser.parseSubmission(attributeValue2, attributeValue3, xPathReference, element);
        if (attributeValue == null) {
            this._f.setDefaultSubmission(parseSubmission);
        } else {
            this._f.addSubmissionProfile(attributeValue, parseSubmission);
        }
    }

    private void saveInstanceNode(Element element) {
        String attributeValue = element.getAttributeValue("", ID_ATTR);
        Element element2 = null;
        for (int i = 0; i < element.getChildCount(); i++) {
            if (element.getType(i) == 2) {
                if (element2 != null) {
                    throw new XFormParseException("XForm Parse: <instance> has more than one child element", element);
                }
                element2 = element.getElement(i);
            }
        }
        if (this.mainInstanceNode == null) {
            this.mainInstanceNode = element2;
        }
        this.instanceNodes.addElement(element2);
        this.instanceNodeIdStrs.addElement(attributeValue);
    }

    protected void processAdditionalAttributes(QuestionDef questionDef, Element element, Vector vector) {
        for (int i = 0; i < element.getAttributeCount(); i++) {
            String attributeName = element.getAttributeName(i);
            if (!vector.contains(attributeName)) {
                questionDef.setAdditionalAttribute(element.getAttributeNamespace(i), attributeName, element.getAttributeValue(i));
            }
        }
        if (XFormUtils.showUnusedAttributeWarning(element, vector)) {
            System.out.println(XFormUtils.unusedAttWarning(element, vector));
        }
    }

    protected QuestionDef parseUpload(IFormElement iFormElement, Element element, int i) {
        Vector vector = new Vector();
        vector.addElement("mediatype");
        String attributeValue = element.getAttributeValue(null, "mediatype");
        QuestionDef parseControl = parseControl(iFormElement, element, i, vector);
        if ("image/*".equals(attributeValue)) {
            parseControl.setControlType(10);
        } else if ("audio/*".equals(attributeValue)) {
            parseControl.setControlType(12);
        } else if ("video/*".equals(attributeValue)) {
            parseControl.setControlType(13);
        }
        return parseControl;
    }

    protected QuestionDef parseControl(IFormElement iFormElement, Element element, int i) {
        return parseControl(iFormElement, element, i, null);
    }

    protected QuestionDef parseControl(IFormElement iFormElement, Element element, int i, Vector vector) {
        boolean z;
        IDataReference iDataReference;
        QuestionDef questionDef = new QuestionDef();
        int i2 = this.serialQuestionID;
        this.serialQuestionID = i2 + 1;
        questionDef.setID(i2);
        if (vector == null) {
            vector = new Vector();
        }
        vector.addElement(REF_ATTR);
        vector.addElement(BIND_ATTR);
        vector.addElement(APPEARANCE_ATTR);
        String attributeValue = element.getAttributeValue(null, REF_ATTR);
        String attributeValue2 = element.getAttributeValue(null, BIND_ATTR);
        if (attributeValue2 != null) {
            DataBinding dataBinding = this.bindingsByID.get(attributeValue2);
            if (dataBinding == null) {
                throw new XFormParseException("XForm Parse: invalid binding ID '" + attributeValue2 + "'", element);
            }
            iDataReference = dataBinding.getReference();
            z = true;
        } else if (attributeValue != null) {
            iDataReference = new XPathReference(attributeValue);
            z = false;
        } else if (i != 9) {
            throw new XFormParseException("XForm Parse: input control with neither 'ref' nor 'bind'", element);
        } else {
            z = false;
            iDataReference = null;
        }
        if (iDataReference != null) {
            if (!z) {
                iDataReference = getAbsRef(iDataReference, iFormElement);
            }
            questionDef.setBind(iDataReference);
            if (i == 2) {
                this.selectOnes.addElement((TreeReference) iDataReference.getReference());
            } else if (i == 3) {
                this.selectMultis.addElement((TreeReference) iDataReference.getReference());
            }
        }
        boolean z2 = i == 3 || i == 2;
        questionDef.setControlType(i);
        questionDef.setAppearanceAttr(element.getAttributeValue(null, APPEARANCE_ATTR));
        for (int i3 = 0; i3 < element.getChildCount(); i3++) {
            Element element2 = element.getType(i3) == 2 ? element.getElement(i3) : null;
            String name = element2 != null ? element2.getName() : null;
            if (LABEL_ELEMENT.equals(name)) {
                parseQuestionLabel(questionDef, element2);
            } else if ("hint".equals(name)) {
                parseHint(questionDef, element2);
            } else if (z2 && "item".equals(name)) {
                parseItem(questionDef, element2);
            } else if (z2 && "itemset".equals(name)) {
                parseItemset(questionDef, element2, iFormElement);
            }
        }
        if (z2) {
            if (questionDef.getNumChoices() > 0 && questionDef.getDynamicChoices() != null) {
                throw new XFormParseException("Select question contains both literal choices and <itemset>");
            }
            if (questionDef.getNumChoices() == 0 && questionDef.getDynamicChoices() == null) {
                throw new XFormParseException("Select question has no choices");
            }
        }
        iFormElement.addChild(questionDef);
        processAdditionalAttributes(questionDef, element, vector);
        return questionDef;
    }

    private void parseQuestionLabel(QuestionDef questionDef, Element element) {
        String label = getLabel(element);
        String attributeValue = element.getAttributeValue("", REF_ATTR);
        Vector vector = new Vector();
        vector.addElement(REF_ATTR);
        if (attributeValue != null) {
            if (attributeValue.startsWith(ITEXT_OPEN) && attributeValue.endsWith(ITEXT_CLOSE)) {
                String substring = attributeValue.substring(ITEXT_OPEN.length(), attributeValue.indexOf(ITEXT_CLOSE));
                verifyTextMappings(substring, "Question <label>", true);
                questionDef.setTextID(substring);
            } else {
                throw new RuntimeException("malformed ref [" + attributeValue + "] for <label>");
            }
        } else {
            questionDef.setLabelInnerText(label);
        }
        if (XFormUtils.showUnusedAttributeWarning(element, vector)) {
            System.out.println(XFormUtils.unusedAttWarning(element, vector));
        }
    }

    public void parseGroupLabel(GroupDef groupDef, Element element) {
        if (!groupDef.getRepeat()) {
            Vector vector = new Vector();
            vector.addElement(REF_ATTR);
            String label = getLabel(element);
            String attributeValue = element.getAttributeValue("", REF_ATTR);
            if (attributeValue != null) {
                if (attributeValue.startsWith(ITEXT_OPEN) && attributeValue.endsWith(ITEXT_CLOSE)) {
                    String substring = attributeValue.substring(ITEXT_OPEN.length(), attributeValue.indexOf(ITEXT_CLOSE));
                    verifyTextMappings(substring, "Group <label>", true);
                    groupDef.setTextID(substring);
                } else {
                    throw new RuntimeException("malformed ref [" + attributeValue + "] for <label>");
                }
            } else {
                groupDef.setLabelInnerText(label);
            }
            if (XFormUtils.showUnusedAttributeWarning(element, vector)) {
                System.out.println(XFormUtils.unusedAttWarning(element, vector));
            }
        }
    }

    private String getLabel(Element element) {
        if (element.getChildCount() == 0) {
            return null;
        }
        recurseForOutput(element);
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < element.getChildCount()) {
                if (element.getType(i2) != 4 && !(element.getChild(i2) instanceof String)) {
                    Element element2 = (Element) element.getChild(i2);
                    if (NAMESPACE_HTML.equals(element2.getNamespace())) {
                        stringBuffer.append(XFormSerializer.elementToString(element2));
                    } else {
                        System.out.println("Unrecognized tag inside of text: <" + element2.getName() + ">. Did you intend to use HTML markup? If so, ensure that the element is defined in the HTML namespace.");
                    }
                } else {
                    stringBuffer.append(element.getText(i2));
                }
                i = i2 + 1;
            } else {
                return stringBuffer.toString().trim();
            }
        }
    }

    private void recurseForOutput(Element element) {
        if (element.getChildCount() != 0) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < element.getChildCount()) {
                    int type = element.getType(i2);
                    if (type != 4 && !(element.getChild(i2) instanceof String)) {
                        Element element2 = (Element) element.getChild(i2);
                        if (type == 2 && XFormUtils.isOutput(element2)) {
                            element.removeChild(i2);
                            element.addChild(i2, 4, "${" + parseOutput(element2) + "}");
                        } else if (element2.getChildCount() != 0) {
                            recurseForOutput(element2);
                        }
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    private String parseOutput(Element element) {
        int size;
        Vector vector = new Vector();
        vector.addElement(REF_ATTR);
        vector.addElement(VALUE);
        String attributeValue = element.getAttributeValue(null, REF_ATTR);
        if (attributeValue == null) {
            attributeValue = element.getAttributeValue(null, VALUE);
        }
        if (attributeValue == null) {
            throw new XFormParseException("XForm Parse: <output> without 'ref' or 'value'", element);
        }
        try {
            XPathConditional xPathConditional = new XPathConditional(attributeValue);
            if (this._f.getOutputFragments().contains(xPathConditional)) {
                size = this._f.getOutputFragments().indexOf(xPathConditional);
            } else {
                size = this._f.getOutputFragments().size();
                this._f.getOutputFragments().addElement(xPathConditional);
            }
            if (XFormUtils.showUnusedAttributeWarning(element, vector)) {
                System.out.println(XFormUtils.unusedAttWarning(element, vector));
            }
            return String.valueOf(size);
        } catch (XPathSyntaxException e) {
            System.err.println("Invalid XPath expression [" + attributeValue + "]!");
            return "";
        }
    }

    private void parseHint(QuestionDef questionDef, Element element) {
        Vector vector = new Vector();
        vector.addElement(REF_ATTR);
        String xMLText = getXMLText(element, true);
        String label = getLabel(element);
        String attributeValue = element.getAttributeValue("", REF_ATTR);
        if (attributeValue != null) {
            if (attributeValue.startsWith(ITEXT_OPEN) && attributeValue.endsWith(ITEXT_CLOSE)) {
                String substring = attributeValue.substring(ITEXT_OPEN.length(), attributeValue.indexOf(ITEXT_CLOSE));
                verifyTextMappings(substring, "<hint>", false);
                questionDef.setHelpTextID(substring);
            } else {
                throw new RuntimeException("malformed ref [" + attributeValue + "] for <hint>");
            }
        } else {
            questionDef.setHelpInnerText(label);
            questionDef.setHelpText(xMLText);
        }
        if (XFormUtils.showUnusedAttributeWarning(element, vector)) {
            System.out.println(XFormUtils.unusedAttWarning(element, vector));
        }
    }

    private void parseItem(QuestionDef questionDef, Element element) {
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        vector2.addElement(REF_ATTR);
        vector3.addElement(FORM_ATTR);
        String str = null;
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < element.getChildCount(); i++) {
            Element element2 = element.getType(i) == 2 ? element.getElement(i) : null;
            String name = element2 != null ? element2.getName() : null;
            if (LABEL_ELEMENT.equals(name)) {
                if (XFormUtils.showUnusedAttributeWarning(element2, vector2)) {
                    System.out.println(XFormUtils.unusedAttWarning(element2, vector2));
                }
                str3 = getLabel(element2);
                String attributeValue = element2.getAttributeValue("", REF_ATTR);
                if (attributeValue == null) {
                    continue;
                } else if (attributeValue.startsWith(ITEXT_OPEN) && attributeValue.endsWith(ITEXT_CLOSE)) {
                    str2 = attributeValue.substring(ITEXT_OPEN.length(), attributeValue.indexOf(ITEXT_CLOSE));
                    verifyTextMappings(str2, "Item <label>", true);
                } else {
                    throw new XFormParseException("malformed ref [" + attributeValue + "] for <item>", element2);
                }
            } else if (VALUE.equals(name)) {
                str = getXMLText(element2, true);
                if (XFormUtils.showUnusedAttributeWarning(element2, vector3)) {
                    System.out.println(XFormUtils.unusedAttWarning(element2, vector3));
                }
                if (str != null) {
                    if (str.length() > 32) {
                        System.err.println("WARNING: choice value [" + str + "] is too long; max. suggested length 32 chars" + getVagueLocation(element2));
                    }
                    int i2 = 0;
                    while (true) {
                        if (i2 >= str.length()) {
                            break;
                        } else if (" \n\t\f\r'\"`".indexOf(str.charAt(i2)) < 0) {
                            i2++;
                        } else {
                            boolean z = questionDef.getControlType() == 3;
                            System.err.println("XForm Parse WARNING: " + (z ? SELECT : SELECTONE) + " question <value>s [" + str + "] " + (z ? "cannot" : "should not") + " contain spaces, and are recommended not to contain apostraphes/quotation marks" + getVagueLocation(element2));
                        }
                    }
                }
            }
        }
        if (str2 == null && str3 == null) {
            throw new XFormParseException("<item> without proper <label>", element);
        }
        if (str == null) {
            throw new XFormParseException("<item> without proper <value>", element);
        }
        if (str2 != null) {
            questionDef.addSelectChoice(new SelectChoice(str2, str));
        } else {
            questionDef.addSelectChoice(new SelectChoice(null, str3, str, false));
        }
        if (XFormUtils.showUnusedAttributeWarning(element, vector)) {
            System.out.println(XFormUtils.unusedAttWarning(element, vector));
        }
    }

    private void parseItemset(QuestionDef questionDef, Element element, IFormElement iFormElement) {
        ItemsetBinding itemsetBinding = new ItemsetBinding();
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        Vector vector4 = new Vector();
        vector.addElement(NODESET_ATTR);
        vector2.addElement(REF_ATTR);
        vector3.addElement(REF_ATTR);
        vector3.addElement(FORM_ATTR);
        vector4.addElement(REF_ATTR);
        String attributeValue = element.getAttributeValue("", NODESET_ATTR);
        if (attributeValue == null) {
            throw new RuntimeException("No nodeset attribute in element: [" + element.getName() + "]. This is required. (Element Printout:" + XFormSerializer.elementToString(element) + ")");
        }
        XPathPathExpr pathExpr = XPathReference.getPathExpr(attributeValue);
        itemsetBinding.nodesetExpr = new XPathConditional(pathExpr);
        itemsetBinding.contextRef = getFormElementRef(iFormElement);
        itemsetBinding.nodesetRef = FormInstance.unpackReference(getAbsRef(new XPathReference(pathExpr.getReference(true)), itemsetBinding.contextRef));
        for (int i = 0; i < element.getChildCount(); i++) {
            Element element2 = element.getType(i) == 2 ? element.getElement(i) : null;
            String name = element2 != null ? element2.getName() : null;
            if (LABEL_ELEMENT.equals(name)) {
                String attributeValue2 = element2.getAttributeValue("", REF_ATTR);
                boolean z = false;
                if (XFormUtils.showUnusedAttributeWarning(element2, vector2)) {
                    System.out.println(XFormUtils.unusedAttWarning(element2, vector2));
                }
                if (attributeValue2 != null) {
                    if (attributeValue2.startsWith("jr:itext(") && attributeValue2.endsWith(")")) {
                        attributeValue2 = attributeValue2.substring("jr:itext(".length(), attributeValue2.indexOf(")"));
                        z = true;
                    }
                    XPathPathExpr pathExpr2 = XPathReference.getPathExpr(attributeValue2);
                    itemsetBinding.labelRef = FormInstance.unpackReference(getAbsRef(new XPathReference(pathExpr2), itemsetBinding.nodesetRef));
                    itemsetBinding.labelExpr = new XPathConditional(pathExpr2);
                    itemsetBinding.labelIsItext = z;
                } else {
                    throw new XFormParseException("<label> in <itemset> requires 'ref'");
                }
            } else if ("copy".equals(name)) {
                String attributeValue3 = element2.getAttributeValue("", REF_ATTR);
                if (XFormUtils.showUnusedAttributeWarning(element2, vector4)) {
                    System.out.println(XFormUtils.unusedAttWarning(element2, vector4));
                }
                if (attributeValue3 == null) {
                    throw new XFormParseException("<copy> in <itemset> requires 'ref'");
                }
                itemsetBinding.copyRef = FormInstance.unpackReference(getAbsRef(new XPathReference(attributeValue3), itemsetBinding.nodesetRef));
                itemsetBinding.copyMode = true;
            } else if (VALUE.equals(name)) {
                String attributeValue4 = element2.getAttributeValue("", REF_ATTR);
                if (XFormUtils.showUnusedAttributeWarning(element2, vector3)) {
                    System.out.println(XFormUtils.unusedAttWarning(element2, vector3));
                }
                if (attributeValue4 == null) {
                    throw new XFormParseException("<value> in <itemset> requires 'ref'");
                }
                XPathPathExpr pathExpr3 = XPathReference.getPathExpr(attributeValue4);
                itemsetBinding.valueRef = FormInstance.unpackReference(getAbsRef(new XPathReference(pathExpr3), itemsetBinding.nodesetRef));
                itemsetBinding.valueExpr = new XPathConditional(pathExpr3);
                itemsetBinding.copyMode = false;
            } else {
                continue;
            }
        }
        if (itemsetBinding.labelRef == null) {
            throw new XFormParseException("<itemset> requires <label>");
        }
        if (itemsetBinding.copyRef == null && itemsetBinding.valueRef == null) {
            throw new XFormParseException("<itemset> requires <copy> or <value>");
        }
        if (itemsetBinding.copyRef != null) {
            if (itemsetBinding.valueRef == null) {
                System.err.println("WARNING: <itemset>s with <copy> are STRONGLY recommended to have <value> as well; pre-selecting, default answers, and display of answers will not work properly otherwise");
            } else if (!itemsetBinding.copyRef.isParentOf(itemsetBinding.valueRef, false)) {
                throw new XFormParseException("<value> is outside <copy>");
            }
        }
        questionDef.setDynamicChoices(itemsetBinding);
        this.itemsets.addElement(itemsetBinding);
        if (XFormUtils.showUnusedAttributeWarning(element, vector)) {
            System.out.println(XFormUtils.unusedAttWarning(element, vector));
        }
    }

    public void parseGroup(IFormElement iFormElement, Element element, int i) {
        boolean z;
        IDataReference iDataReference;
        GroupDef groupDef = new GroupDef();
        int i2 = this.serialQuestionID;
        this.serialQuestionID = i2 + 1;
        groupDef.setID(i2);
        Vector vector = new Vector();
        vector.addElement(REF_ATTR);
        vector.addElement(NODESET_ATTR);
        vector.addElement(BIND_ATTR);
        vector.addElement(APPEARANCE_ATTR);
        vector.addElement("count");
        vector.addElement("noAddRemove");
        if (i == 2) {
            groupDef.setRepeat(true);
        }
        String attributeValue = element.getAttributeValue(null, REF_ATTR);
        String attributeValue2 = element.getAttributeValue(null, NODESET_ATTR);
        String attributeValue3 = element.getAttributeValue(null, BIND_ATTR);
        groupDef.setAppearanceAttr(element.getAttributeValue(null, APPEARANCE_ATTR));
        if (attributeValue3 != null) {
            DataBinding dataBinding = this.bindingsByID.get(attributeValue3);
            if (dataBinding == null) {
                throw new XFormParseException("XForm Parse: invalid binding ID [" + attributeValue3 + "]", element);
            }
            iDataReference = dataBinding.getReference();
            z = true;
        } else if (groupDef.getRepeat()) {
            if (attributeValue2 != null) {
                iDataReference = new XPathReference(attributeValue2);
                z = false;
            } else {
                throw new XFormParseException("XForm Parse: <repeat> with no binding ('bind' or 'nodeset')", element);
            }
        } else if (attributeValue != null) {
            iDataReference = new XPathReference(attributeValue);
            z = false;
        } else {
            z = false;
            iDataReference = null;
        }
        if (!z) {
            iDataReference = getAbsRef(iDataReference, iFormElement);
        }
        groupDef.setBind(iDataReference);
        if (groupDef.getRepeat()) {
            this.repeats.addElement((TreeReference) iDataReference.getReference());
            String attributeValue4 = element.getAttributeValue(NAMESPACE_JAVAROSA, "count");
            if (attributeValue4 != null) {
                groupDef.count = getAbsRef(new XPathReference(attributeValue4), iFormElement);
                groupDef.noAddRemove = true;
            } else {
                groupDef.noAddRemove = element.getAttributeValue(NAMESPACE_JAVAROSA, "noAddRemove") != null;
            }
        }
        for (int i3 = 0; i3 < element.getChildCount(); i3++) {
            Element element2 = element.getType(i3) == 2 ? element.getElement(i3) : null;
            String name = element2 != null ? element2.getName() : null;
            String namespace = element2 != null ? element2.getNamespace() : null;
            if (groupDef.getRepeat() && NAMESPACE_JAVAROSA.equals(namespace)) {
                if ("chooseCaption".equals(name)) {
                    groupDef.chooseCaption = getLabel(element2);
                } else if ("addCaption".equals(name)) {
                    groupDef.addCaption = getLabel(element2);
                } else if ("delCaption".equals(name)) {
                    groupDef.delCaption = getLabel(element2);
                } else if ("doneCaption".equals(name)) {
                    groupDef.doneCaption = getLabel(element2);
                } else if ("addEmptyCaption".equals(name)) {
                    groupDef.addEmptyCaption = getLabel(element2);
                } else if ("doneEmptyCaption".equals(name)) {
                    groupDef.doneEmptyCaption = getLabel(element2);
                } else if ("entryHeader".equals(name)) {
                    groupDef.entryHeader = getLabel(element2);
                } else if ("delHeader".equals(name)) {
                    groupDef.delHeader = getLabel(element2);
                } else if ("mainHeader".equals(name)) {
                    groupDef.mainHeader = getLabel(element2);
                }
            }
        }
        for (int i4 = 0; i4 < element.getChildCount(); i4++) {
            if (element.getType(i4) == 2) {
                parseElement(element.getElement(i4), groupDef, groupLevelHandlers);
            }
        }
        for (int i5 = 0; i5 < element.getAttributeCount(); i5++) {
            String attributeName = element.getAttributeName(i5);
            if (!vector.contains(attributeName)) {
                groupDef.setAdditionalAttribute(element.getAttributeNamespace(i5), attributeName, element.getAttributeValue(i5));
            }
        }
        if (XFormUtils.showUnusedAttributeWarning(element, vector)) {
            System.out.println(XFormUtils.unusedAttWarning(element, vector));
        }
        iFormElement.addChild(groupDef);
    }

    private TreeReference getFormElementRef(IFormElement iFormElement) {
        if (iFormElement instanceof FormDef) {
            TreeReference rootRef = TreeReference.rootRef();
            rootRef.add(this.mainInstanceNode.getName(), 0);
            return rootRef;
        }
        return (TreeReference) iFormElement.getBind().getReference();
    }

    private IDataReference getAbsRef(IDataReference iDataReference, IFormElement iFormElement) {
        return getAbsRef(iDataReference, getFormElementRef(iFormElement));
    }

    private static IDataReference getAbsRef(IDataReference iDataReference, TreeReference treeReference) {
        TreeReference selfRef;
        if (!treeReference.isAbsolute()) {
            throw new RuntimeException("XFormParser.getAbsRef: parentRef must be absolute");
        }
        if (iDataReference != null) {
            selfRef = (TreeReference) iDataReference.getReference();
        } else {
            selfRef = TreeReference.selfRef();
        }
        TreeReference parent = selfRef.parent(treeReference);
        if (parent == null) {
            throw new XFormParseException("Binding path [" + parent + "] not allowed with parent binding of [" + treeReference + "]");
        }
        return new XPathReference(parent);
    }

    private static void collapseRepeatGroups(IFormElement iFormElement) {
        GroupDef groupDef;
        if (iFormElement.getChildren() != null) {
            for (int i = 0; i < iFormElement.getChildren().size(); i++) {
                IFormElement child = iFormElement.getChild(i);
                GroupDef groupDef2 = child instanceof GroupDef ? (GroupDef) child : null;
                if (groupDef2 != null) {
                    if (!groupDef2.getRepeat() && groupDef2.getChildren().size() == 1) {
                        IFormElement iFormElement2 = (IFormElement) groupDef2.getChildren().elementAt(0);
                        groupDef = iFormElement2 instanceof GroupDef ? (GroupDef) iFormElement2 : null;
                        if (groupDef != null && groupDef.getRepeat()) {
                            groupDef.setLabelInnerText(groupDef2.getLabelInnerText());
                            groupDef.setTextID(groupDef2.getTextID());
                            iFormElement.getChildren().setElementAt(groupDef, i);
                            collapseRepeatGroups(groupDef);
                        }
                    }
                    groupDef = groupDef2;
                    collapseRepeatGroups(groupDef);
                }
            }
        }
    }

    private void parseIText(Element element) {
        Localizer localizer = new Localizer(true, true);
        this._f.setLocalizer(localizer);
        localizer.registerLocalizable(this._f);
        Vector vector = new Vector();
        for (int i = 0; i < element.getChildCount(); i++) {
            Element element2 = element.getElement(i);
            if (element2 != null && element2.getName().equals("translation")) {
                parseTranslation(localizer, element2);
            }
        }
        if (localizer.getAvailableLocales().length == 0) {
            throw new XFormParseException("no <translation>s defined", element);
        }
        if (localizer.getDefaultLocale() == null) {
            localizer.setDefaultLocale(localizer.getAvailableLocales()[0]);
        }
        if (XFormUtils.showUnusedAttributeWarning(element, vector)) {
            System.out.println(XFormUtils.unusedAttWarning(element, vector));
        }
    }

    private void parseTranslation(Localizer localizer, Element element) {
        Vector vector = new Vector();
        vector.addElement("lang");
        vector.addElement("default");
        String attributeValue = element.getAttributeValue("", "lang");
        if (attributeValue == null || attributeValue.length() == 0) {
            throw new XFormParseException("no language specified for <translation>", element);
        }
        String attributeValue2 = element.getAttributeValue("", "default");
        if (!localizer.addAvailableLocale(attributeValue)) {
            throw new XFormParseException("duplicate <translation> for language '" + attributeValue + "'", element);
        }
        if (attributeValue2 != null) {
            if (localizer.getDefaultLocale() != null) {
                throw new XFormParseException("more than one <translation> set as default", element);
            }
            localizer.setDefaultLocale(attributeValue);
        }
        TableLocaleSource tableLocaleSource = new TableLocaleSource();
        int i = 0;
        while (i < element.getChildCount()) {
            Element element2 = element.getElement(i);
            if (element2 != null && element2.getName().equals("text")) {
                parseTextHandle(tableLocaleSource, element2);
                element.removeChild(i);
                i--;
            }
            i++;
        }
        if (XFormUtils.showUnusedAttributeWarning(element, vector)) {
            System.out.println(XFormUtils.unusedAttWarning(element, vector));
        }
        localizer.registerLocaleResource(attributeValue, tableLocaleSource);
    }

    private void parseTextHandle(TableLocaleSource tableLocaleSource, Element element) {
        String attributeValue = element.getAttributeValue("", ID_ATTR);
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        vector.addElement(ID_ATTR);
        vector.addElement(FORM_ATTR);
        vector2.addElement(FORM_ATTR);
        vector2.addElement(ID_ATTR);
        if (attributeValue == null || attributeValue.length() == 0) {
            throw new XFormParseException("no id defined for <text>", element);
        }
        for (int i = 0; i < element.getChildCount(); i++) {
            Element element2 = element.getElement(i);
            if (element2 != null) {
                if (!element2.getName().equals(VALUE)) {
                    throw new XFormParseException("Unrecognized element [" + element2.getName() + "] in Itext->translation->text");
                }
                String attributeValue2 = element2.getAttributeValue("", FORM_ATTR);
                if (attributeValue2 != null && attributeValue2.length() == 0) {
                    attributeValue2 = null;
                }
                String label = getLabel(element2);
                String str = label == null ? "" : label;
                String str2 = attributeValue2 == null ? attributeValue : attributeValue + ";" + attributeValue2;
                if (tableLocaleSource.hasMapping(str2)) {
                    throw new XFormParseException("duplicate definition for text ID \"" + attributeValue + "\" and form \"" + attributeValue2 + "\". Can only have one definition for each text form.", element);
                }
                tableLocaleSource.setLocaleMapping(str2, str);
                if (XFormUtils.showUnusedAttributeWarning(element2, vector2)) {
                    System.out.println(XFormUtils.unusedAttWarning(element2, vector2));
                }
            }
        }
        if (XFormUtils.showUnusedAttributeWarning(element, vector)) {
            System.out.println(XFormUtils.unusedAttWarning(element, vector));
        }
    }

    private boolean hasITextMapping(String str, String str2) {
        Localizer localizer = this._f.getLocalizer();
        if (str2 == null) {
            str2 = localizer.getDefaultLocale();
        }
        return localizer.hasMapping(str2, str);
    }

    private void verifyTextMappings(String str, String str2, boolean z) {
        Localizer localizer = this._f.getLocalizer();
        String[] availableLocales = localizer.getAvailableLocales();
        for (int i = 0; i < availableLocales.length; i++) {
            if (!hasITextMapping(str, availableLocales[i]) && (!z || !hasSpecialFormMapping(str, availableLocales[i]))) {
                if (availableLocales[i].equals(localizer.getDefaultLocale())) {
                    throw new XFormParseException(str2 + " '" + str + "': text is not localizable for default locale [" + localizer.getDefaultLocale() + "]!");
                }
                System.err.println("Warning: " + str2 + " '" + str + "': text is not localizable for locale " + availableLocales[i] + ".");
            }
        }
    }

    private boolean hasSpecialFormMapping(String str, String str2) {
        Iterator<String> it = this.itextKnownForms.iterator();
        while (it.hasNext()) {
            if (hasITextMapping(str + ";" + it.next(), str2)) {
                return true;
            }
        }
        Enumeration keys = this._f.getLocalizer().getLocaleData(str2).keys();
        while (keys.hasMoreElements()) {
            String str3 = (String) keys.nextElement();
            if (str3.startsWith(str + ";")) {
                String substring = str3.substring(str3.indexOf(";") + 1, str3.length());
                System.out.println("adding unexpected special itext form: " + substring + " to list of expected forms");
                this.itextKnownForms.addElement(substring);
                return true;
            }
        }
        return false;
    }

    protected DataBinding processStandardBindAttributes(Vector vector, Element element) {
        vector.addElement(ID_ATTR);
        vector.addElement(NODESET_ATTR);
        vector.addElement("type");
        vector.addElement("relevant");
        vector.addElement("required");
        vector.addElement("readonly");
        vector.addElement("constraint");
        vector.addElement("constraintMsg");
        vector.addElement("calculate");
        vector.addElement("preload");
        vector.addElement("preloadParams");
        DataBinding dataBinding = new DataBinding();
        dataBinding.setId(element.getAttributeValue("", ID_ATTR));
        String attributeValue = element.getAttributeValue(null, NODESET_ATTR);
        if (attributeValue == null) {
            throw new XFormParseException("XForm Parse: <bind> without nodeset", element);
        }
        IDataReference absRef = getAbsRef(new XPathReference(attributeValue), this._f);
        dataBinding.setReference(absRef);
        dataBinding.setDataType(getDataType(element.getAttributeValue(null, "type")));
        String attributeValue2 = element.getAttributeValue(null, "relevant");
        if (attributeValue2 != null) {
            if ("true()".equals(attributeValue2)) {
                dataBinding.relevantAbsolute = true;
            } else if ("false()".equals(attributeValue2)) {
                dataBinding.relevantAbsolute = false;
            } else {
                dataBinding.relevancyCondition = (Condition) this._f.addTriggerable(buildCondition(attributeValue2, "relevant", absRef));
            }
        }
        String attributeValue3 = element.getAttributeValue(null, "required");
        if (attributeValue3 != null) {
            if ("true()".equals(attributeValue3)) {
                dataBinding.requiredAbsolute = true;
            } else if ("false()".equals(attributeValue3)) {
                dataBinding.requiredAbsolute = false;
            } else {
                dataBinding.requiredCondition = (Condition) this._f.addTriggerable(buildCondition(attributeValue3, "required", absRef));
            }
        }
        String attributeValue4 = element.getAttributeValue(null, "readonly");
        if (attributeValue4 != null) {
            if ("true()".equals(attributeValue4)) {
                dataBinding.readonlyAbsolute = true;
            } else if ("false()".equals(attributeValue4)) {
                dataBinding.readonlyAbsolute = false;
            } else {
                dataBinding.readonlyCondition = (Condition) this._f.addTriggerable(buildCondition(attributeValue4, "readonly", absRef));
            }
        }
        String attributeValue5 = element.getAttributeValue(null, "constraint");
        if (attributeValue5 != null) {
            try {
                dataBinding.constraint = new XPathConditional(attributeValue5);
            } catch (XPathSyntaxException e) {
                System.err.println("Invalid XPath expression [" + attributeValue5 + "]!" + getVagueLocation(element));
            }
            dataBinding.constraintMessage = element.getAttributeValue(NAMESPACE_JAVAROSA, "constraintMsg");
        }
        String attributeValue6 = element.getAttributeValue(null, "calculate");
        if (attributeValue6 != null) {
            dataBinding.calculate = (Recalculate) this._f.addTriggerable(buildCalculate(attributeValue6, absRef));
        }
        dataBinding.setPreload(element.getAttributeValue(NAMESPACE_JAVAROSA, "preload"));
        dataBinding.setPreloadParams(element.getAttributeValue(NAMESPACE_JAVAROSA, "preloadParams"));
        for (int i = 0; i < element.getAttributeCount(); i++) {
            String attributeName = element.getAttributeName(i);
            if (!vector.contains(attributeName)) {
                dataBinding.setAdditionalAttribute(element.getAttributeNamespace(i), attributeName, element.getAttributeValue(i));
            }
        }
        return dataBinding;
    }

    protected void parseBind(Element element) {
        Vector vector = new Vector();
        DataBinding processStandardBindAttributes = processStandardBindAttributes(vector, element);
        if (XFormUtils.showUnusedAttributeWarning(element, vector)) {
            System.out.println(XFormUtils.unusedAttWarning(element, vector));
        }
        addBinding(processStandardBindAttributes);
    }

    private static Condition buildCondition(String str, String str2, IDataReference iDataReference) {
        int i;
        int i2;
        if ("relevant".equals(str2)) {
            i = 1;
            i2 = 2;
        } else if ("required".equals(str2)) {
            i = 7;
            i2 = 8;
        } else if ("readonly".equals(str2)) {
            i = 4;
            i2 = 3;
        } else {
            i2 = -1;
            i = -1;
        }
        try {
            return new Condition(new XPathConditional(str), i, i2, FormInstance.unpackReference(iDataReference));
        } catch (XPathSyntaxException e) {
            System.err.println("Invalid XPath expression [" + str + "]!");
            return null;
        }
    }

    private static Recalculate buildCalculate(String str, IDataReference iDataReference) {
        try {
            return new Recalculate(new XPathConditional(str), FormInstance.unpackReference(iDataReference));
        } catch (XPathSyntaxException e) {
            System.err.println("Invalid XPath expression [" + str + "]!");
            return null;
        }
    }

    protected void addBinding(DataBinding dataBinding) {
        this.bindings.addElement(dataBinding);
        if (dataBinding.getId() != null && this.bindingsByID.put(dataBinding.getId(), dataBinding) != null) {
            throw new XFormParseException("XForm Parse: <bind>s with duplicate ID: '" + dataBinding.getId() + "'");
        }
    }

    private void addMainInstanceToFormDef(Element element, FormInstance formInstance) {
        loadInstanceData(element, formInstance.getRoot(), this._f);
        checkDependencyCycles();
        this._f.setInstance(formInstance);
        this._f.finalizeTriggerables();
    }

    private FormInstance parseInstance(Element element, boolean z) {
        String elementAt = this.instanceNodeIdStrs.elementAt(this.instanceNodes.indexOf(element));
        FormInstance formInstance = new FormInstance(buildInstanceStructure(element, null, !z ? elementAt : null));
        if (z) {
            formInstance.setName(this._f.getTitle());
        } else {
            formInstance.setName(elementAt);
        }
        Vector vector = new Vector();
        vector.addElement(ID_ATTR);
        vector.addElement("version");
        vector.addElement("uiVersion");
        String namespace = element.getNamespace();
        if (namespace != null && namespace.length() > 0 && !namespace.equals(this.defaultNamespace)) {
            formInstance.schema = namespace;
        }
        formInstance.formVersion = element.getAttributeValue(null, "version");
        formInstance.uiVersion = element.getAttributeValue(null, "uiVersion");
        loadNamespaces(element, formInstance);
        if (z) {
            processRepeats(formInstance);
            verifyBindings(formInstance);
        }
        applyInstanceProperties(formInstance);
        if (XFormUtils.showUnusedAttributeWarning(element, vector)) {
            System.out.println(XFormUtils.unusedAttWarning(element, vector));
        }
        return formInstance;
    }

    private static Hashtable<String, String> loadNamespaces(Element element, FormInstance formInstance) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        for (int i = 0; i < element.getNamespaceCount(); i++) {
            String namespaceUri = element.getNamespaceUri(i);
            String namespacePrefix = element.getNamespacePrefix(i);
            if (namespaceUri != null && namespacePrefix != null) {
                formInstance.addNamespace(namespacePrefix, namespaceUri);
            }
        }
        return hashtable;
    }

    public static TreeElement buildInstanceStructure(Element element, TreeElement treeElement) {
        return buildInstanceStructure(element, treeElement, null);
    }

    public static TreeElement buildInstanceStructure(Element element, TreeElement treeElement, String str) {
        int i;
        TreeElement treeElement2;
        boolean z;
        boolean z2;
        int childCount = element.getChildCount();
        int i2 = 0;
        boolean z3 = false;
        boolean z4 = false;
        while (i2 < childCount) {
            switch (element.getType(i2)) {
                case 2:
                    z2 = z4;
                    z = true;
                    continue;
                    i2++;
                    boolean z5 = z;
                    z4 = z2;
                    z3 = z5;
                case 4:
                    if (element.getText(i2).trim().length() > 0) {
                        z = z3;
                        z2 = true;
                        continue;
                        i2++;
                        boolean z52 = z;
                        z4 = z2;
                        z3 = z52;
                    }
                    break;
            }
            boolean z6 = z3;
            z2 = z4;
            z = z6;
            i2++;
            boolean z522 = z;
            z4 = z2;
            z3 = z522;
        }
        if (z3 && z4) {
            System.out.println("Warning: instance node '" + element.getName() + "' contains both elements and text as children; text ignored");
        }
        String name = element.getName();
        if (element.getAttributeValue(NAMESPACE_JAVAROSA, "template") != null) {
            if (treeElement != null && treeElement.getChild(name, -2) != null) {
                throw new XFormParseException("More than one node declared as the template for the same repeated set [" + name + "]", element);
            }
            i = -2;
        } else {
            i = treeElement == null ? 0 : treeElement.getChildMultiplicity(name);
        }
        String attributeValue = element.getAttributeValue(NAMESPACE_JAVAROSA, "modeltype");
        if (attributeValue == null) {
            TreeElement treeElement3 = new TreeElement(name, i);
            treeElement3.setInstanceName(str);
            treeElement2 = treeElement3;
        } else if (typeMappings.get(attributeValue) == null) {
            throw new XFormParseException("ModelType " + attributeValue + " is not recognized.", element);
        } else {
            TreeElement treeElement4 = (TreeElement) modelPrototypes.getNewInstance(typeMappings.get(attributeValue).toString());
            if (treeElement4 == null) {
                TreeElement treeElement5 = new TreeElement(name, i);
                System.out.println("No model type prototype available for " + attributeValue);
                treeElement2 = treeElement5;
            } else {
                treeElement4.setName(name);
                treeElement4.setMult(i);
                treeElement2 = treeElement4;
            }
        }
        if (z3) {
            for (int i3 = 0; i3 < childCount; i3++) {
                if (element.getType(i3) == 2) {
                    treeElement2.addChild(buildInstanceStructure(element.getElement(i3), treeElement2, str));
                }
            }
        }
        if (element.getAttributeCount() > 0) {
            for (int i4 = 0; i4 < element.getAttributeCount(); i4++) {
                String attributeNamespace = element.getAttributeNamespace(i4);
                String attributeName = element.getAttributeName(i4);
                if ((!attributeNamespace.equals(NAMESPACE_JAVAROSA) || !attributeName.equals("template")) && (!attributeNamespace.equals(NAMESPACE_JAVAROSA) || !attributeName.equals("recordset"))) {
                    treeElement2.setAttribute(attributeNamespace, attributeName, element.getAttributeValue(i4));
                }
            }
        }
        return treeElement2;
    }

    private Vector<TreeReference> getRepeatableRefs() {
        Vector<TreeReference> vector = new Vector<>();
        for (int i = 0; i < this.repeats.size(); i++) {
            vector.addElement(this.repeats.elementAt(i));
        }
        for (int i2 = 0; i2 < this.itemsets.size(); i2++) {
            ItemsetBinding elementAt = this.itemsets.elementAt(i2);
            TreeReference treeReference = elementAt.nodesetRef;
            if (!vector.contains(treeReference)) {
                boolean z = true;
                for (int i3 = 0; i3 < treeReference.size(); i3++) {
                    if (TreeReference.NAME_WILDCARD.equals(treeReference.getName(i3))) {
                        z = false;
                    }
                }
                if (treeReference.getInstanceName() != null) {
                    z = false;
                }
                if (z) {
                    vector.addElement(treeReference);
                }
            }
            if (elementAt.copyMode) {
                TreeReference destRef = elementAt.getDestRef();
                if (!vector.contains(destRef)) {
                    vector.addElement(destRef);
                }
            }
        }
        return vector;
    }

    private void processRepeats(FormInstance formInstance) {
        flagRepeatables(formInstance);
        processTemplates(formInstance);
        checkDuplicateNodesAreRepeatable(formInstance.getRoot());
        checkHomogeneity(formInstance);
    }

    private void flagRepeatables(FormInstance formInstance) {
        Vector<TreeReference> repeatableRefs = getRepeatableRefs();
        for (int i = 0; i < repeatableRefs.size(); i++) {
            Vector<TreeReference> expandReference = new EvaluationContext(formInstance).expandReference(repeatableRefs.elementAt(i), true);
            for (int i2 = 0; i2 < expandReference.size(); i2++) {
                TreeElement resolveReference = formInstance.resolveReference(expandReference.elementAt(i2));
                if (resolveReference != null) {
                    resolveReference.repeatable = true;
                }
            }
        }
    }

    private void processTemplates(FormInstance formInstance) {
        this.repeatTree = buildRepeatTree(getRepeatableRefs(), formInstance.getRoot().getName());
        Vector vector = new Vector();
        checkRepeatsForTemplate(formInstance, this.repeatTree, vector);
        removeInvalidTemplates(formInstance, this.repeatTree);
        createMissingTemplates(formInstance, vector);
    }

    private static FormInstance buildRepeatTree(Vector<TreeReference> vector, String str) {
        TreeElement treeElement = new TreeElement(null, 0);
        for (int i = 0; i < vector.size(); i++) {
            TreeReference elementAt = vector.elementAt(i);
            if (elementAt.getInstanceName() == null && elementAt.size() > 1) {
                TreeElement treeElement2 = treeElement;
                for (int i2 = 0; i2 < elementAt.size(); i2++) {
                    String name = elementAt.getName(i2);
                    TreeElement child = treeElement2.getChild(name, 0);
                    if (child == null) {
                        child = new TreeElement(name, 0);
                        treeElement2.addChild(child);
                    }
                    treeElement2 = child;
                }
                treeElement2.repeatable = true;
            }
        }
        if (treeElement.getNumChildren() == 0) {
            return null;
        }
        return new FormInstance(treeElement.getChild(str, 0));
    }

    private static void checkRepeatsForTemplate(FormInstance formInstance, FormInstance formInstance2, Vector<TreeReference> vector) {
        if (formInstance2 != null) {
            checkRepeatsForTemplate(formInstance2.getRoot(), TreeReference.rootRef(), formInstance, vector);
        }
    }

    private static void checkRepeatsForTemplate(TreeElement treeElement, TreeReference treeReference, FormInstance formInstance, Vector<TreeReference> vector) {
        TreeReference extendRef = treeReference.extendRef(treeElement.getName(), treeElement.repeatable ? -2 : 0);
        if (treeElement.repeatable && formInstance.resolveReference(extendRef) == null) {
            vector.addElement(extendRef);
        }
        for (int i = 0; i < treeElement.getNumChildren(); i++) {
            checkRepeatsForTemplate(treeElement.getChildAt(i), extendRef, formInstance, vector);
        }
    }

    private static void removeInvalidTemplates(FormInstance formInstance, FormInstance formInstance2) {
        removeInvalidTemplates(formInstance.getRoot(), formInstance2 == null ? null : formInstance2.getRoot(), true);
    }

    private static boolean removeInvalidTemplates(TreeElement treeElement, TreeElement treeElement2, boolean z) {
        int mult = treeElement.getMult();
        boolean z2 = treeElement2 == null ? false : treeElement2.repeatable;
        if (mult == -2) {
            if (!z) {
                System.out.println("Warning: template nodes for sub-repeats must be located within the template node of the parent repeat; ignoring template... [" + treeElement.getName() + "]");
                return true;
            } else if (!z2) {
                System.out.println("Warning: template node found for ref that is not repeatable; ignoring... [" + treeElement.getName() + "]");
                return true;
            }
        }
        if (z2 && mult != -2) {
            z = false;
        }
        int i = 0;
        while (i < treeElement.getNumChildren()) {
            TreeElement childAt = treeElement.getChildAt(i);
            if (removeInvalidTemplates(childAt, treeElement2 == null ? null : treeElement2.getChild(childAt.getName(), 0), z)) {
                treeElement.removeChildAt(i);
                i--;
            }
            i++;
        }
        return false;
    }

    private static void createMissingTemplates(FormInstance formInstance, Vector<TreeReference> vector) {
        for (int i = 0; i < vector.size(); i++) {
            TreeReference elementAt = vector.elementAt(i);
            TreeReference clone = elementAt.clone();
            for (int i2 = 0; i2 < clone.size(); i2++) {
                clone.setMultiplicity(i2, -1);
            }
            Vector<TreeReference> expandReference = new EvaluationContext(formInstance).expandReference(clone);
            if (expandReference.size() != 0) {
                try {
                    formInstance.copyNode(expandReference.elementAt(0), elementAt);
                } catch (InvalidReferenceException e) {
                    System.out.println("WARNING! Could not create a default repeat template; this is almost certainly a homogeneity error! Your form will not work! (Failed on " + elementAt.toString() + ")");
                    e.printStackTrace();
                }
                trimRepeatChildren(formInstance.resolveReference(elementAt));
            }
        }
    }

    private static void trimRepeatChildren(TreeElement treeElement) {
        int i = 0;
        while (i < treeElement.getNumChildren()) {
            TreeElement childAt = treeElement.getChildAt(i);
            if (childAt.repeatable) {
                treeElement.removeChildAt(i);
                i--;
            } else {
                trimRepeatChildren(childAt);
            }
            i++;
        }
    }

    private static void checkDuplicateNodesAreRepeatable(TreeElement treeElement) {
        if (treeElement.getMult() > 0 && !treeElement.repeatable) {
            System.out.println("Warning: repeated nodes [" + treeElement.getName() + "] detected that have no repeat binding in the form; DO NOT bind questions to these nodes or their children!");
        }
        for (int i = 0; i < treeElement.getNumChildren(); i++) {
            checkDuplicateNodesAreRepeatable(treeElement.getChildAt(i));
        }
    }

    private void checkHomogeneity(FormInstance formInstance) {
        Vector<TreeReference> repeatableRefs = getRepeatableRefs();
        for (int i = 0; i < repeatableRefs.size(); i++) {
            TreeElement treeElement = null;
            Vector<TreeReference> expandReference = new EvaluationContext(formInstance).expandReference(repeatableRefs.elementAt(i));
            for (int i2 = 0; i2 < expandReference.size(); i2++) {
                TreeReference elementAt = expandReference.elementAt(i2);
                TreeElement resolveReference = formInstance.resolveReference(elementAt);
                if (resolveReference != null) {
                    if (treeElement == null) {
                        treeElement = formInstance.getTemplate(elementAt);
                    }
                    if (!FormInstance.isHomogeneous(treeElement, resolveReference)) {
                        System.out.println("WARNING! Not all repeated nodes for a given repeat binding [" + elementAt.toString() + "] are homogeneous! This will cause serious problems!");
                    }
                }
            }
        }
    }

    private void verifyBindings(FormInstance formInstance) {
        int i = 0;
        while (i < this.bindings.size()) {
            TreeReference unpackReference = FormInstance.unpackReference(this.bindings.elementAt(i).getReference());
            if (unpackReference.size() == 0) {
                System.out.println("Cannot bind to '/'; ignoring bind...");
                this.bindings.removeElementAt(i);
                i--;
            } else if (new EvaluationContext(formInstance).expandReference(unpackReference, true).size() == 0) {
                System.out.println("WARNING: Bind [" + unpackReference.toString() + "] matches no nodes; ignoring bind...");
            }
            i++;
        }
        Vector<TreeReference> repeatableRefs = getRepeatableRefs();
        for (int i2 = 0; i2 < repeatableRefs.size(); i2++) {
            if (repeatableRefs.elementAt(i2).size() <= 1) {
                throw new XFormParseException("Cannot bind repeat to '/' or '/" + this.mainInstanceNode.getName() + "'");
            }
        }
        Vector vector = new Vector();
        verifyControlBindings(this._f, formInstance, vector);
        if (vector.size() > 0) {
            String str = "";
            for (int i3 = 0; i3 < vector.size(); i3++) {
                str = str + ((String) vector.elementAt(i3)) + "\n";
            }
            throw new XFormParseException(str);
        }
        verifyRepeatMemberBindings(this._f, formInstance, null);
        verifyItemsetBindings(formInstance);
        verifyItemsetSrcDstCompatibility(formInstance);
    }

    private static void verifyControlBindings(IFormElement iFormElement, FormInstance formInstance, Vector<String> vector) {
        String str;
        IDataReference iDataReference;
        if (iFormElement.getChildren() != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < iFormElement.getChildren().size()) {
                    IFormElement elementAt = iFormElement.getChildren().elementAt(i2);
                    if (elementAt instanceof GroupDef) {
                        iDataReference = ((GroupDef) elementAt).getBind();
                        str = ((GroupDef) elementAt).getRepeat() ? "Repeat" : "Group";
                    } else if (elementAt instanceof QuestionDef) {
                        iDataReference = ((QuestionDef) elementAt).getBind();
                        str = "Control";
                    } else {
                        str = null;
                        iDataReference = null;
                    }
                    TreeReference unpackReference = FormInstance.unpackReference(iDataReference);
                    if ((elementAt instanceof QuestionDef) && unpackReference.size() == 0) {
                        System.out.println("Warning! Cannot bind control to '/'");
                    } else if (new EvaluationContext(formInstance).expandReference(unpackReference, true).size() == 0) {
                        String str2 = "ERROR: " + str + " binding [" + unpackReference.toString() + "] matches no nodes";
                        System.err.println(str2);
                        vector.addElement(str2);
                    }
                    verifyControlBindings(elementAt, formInstance, vector);
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0128, code lost:
        if (r8 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012a, code lost:
        r1 = (org.javarosa.core.model.GroupDef) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012d, code lost:
        verifyRepeatMemberBindings(r0, r14, r1);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0135, code lost:
        r1 = r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void verifyRepeatMemberBindings(org.javarosa.core.model.IFormElement r13, org.javarosa.core.model.instance.FormInstance r14, org.javarosa.core.model.GroupDef r15) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.javarosa.xform.parse.XFormParser.verifyRepeatMemberBindings(org.javarosa.core.model.IFormElement, org.javarosa.core.model.instance.FormInstance, org.javarosa.core.model.GroupDef):void");
    }

    private void verifyItemsetBindings(FormInstance formInstance) {
        FormInstance formInstance2;
        for (int i = 0; i < this.itemsets.size(); i++) {
            ItemsetBinding elementAt = this.itemsets.elementAt(i);
            if (!elementAt.nodesetRef.isParentOf(elementAt.labelRef, false)) {
                throw new XFormParseException("itemset nodeset ref is not a parent of label ref");
            }
            if (elementAt.copyRef != null && !elementAt.nodesetRef.isParentOf(elementAt.copyRef, false)) {
                throw new XFormParseException("itemset nodeset ref is not a parent of copy ref");
            }
            if (elementAt.valueRef != null && !elementAt.nodesetRef.isParentOf(elementAt.valueRef, false)) {
                throw new XFormParseException("itemset nodeset ref is not a parent of value ref");
            }
            if (elementAt.labelRef.getInstanceName() != null) {
                formInstance2 = this._f.getNonMainInstance(elementAt.labelRef.getInstanceName());
                if (formInstance2 == null) {
                    throw new XFormParseException("Instance: " + elementAt.labelRef.getInstanceName() + " Does not exists");
                }
                elementAt.labelRef.setInstance(formInstance2);
            } else {
                formInstance2 = formInstance;
            }
            if (formInstance2.getTemplatePath(elementAt.labelRef) == null) {
                throw new XFormParseException("<label> node for itemset doesn't exist! [" + elementAt.labelRef + "]");
            }
            if (elementAt.valueRef != null && formInstance2.getTemplatePath(elementAt.valueRef) == null) {
                throw new XFormParseException("<value> node for itemset doesn't exist! [" + elementAt.valueRef + "]");
            }
        }
    }

    private void verifyItemsetSrcDstCompatibility(FormInstance formInstance) {
        TreeElement templatePath;
        TreeElement template;
        for (int i = 0; i < this.itemsets.size(); i++) {
            ItemsetBinding elementAt = this.itemsets.elementAt(i);
            boolean z = formInstance.getTemplate(elementAt.getDestRef()) != null;
            if (elementAt.copyMode) {
                if (!z) {
                    throw new XFormParseException("itemset copies to node(s) which are not repeatable");
                }
                if (!FormInstance.isHomogeneous(formInstance.getTemplatePath(elementAt.copyRef), formInstance.getTemplate(elementAt.getDestRef()))) {
                    System.out.println("WARNING! Source [" + templatePath.getRef().toString() + "] and dest [" + template.getRef().toString() + "] of itemset appear to be incompatible!");
                }
            } else if (z) {
                throw new XFormParseException("itemset sets value on repeatable nodes");
            }
        }
    }

    private void applyInstanceProperties(FormInstance formInstance) {
        for (int i = 0; i < this.bindings.size(); i++) {
            DataBinding elementAt = this.bindings.elementAt(i);
            Vector<TreeReference> expandReference = new EvaluationContext(formInstance).expandReference(FormInstance.unpackReference(elementAt.getReference()), true);
            if (expandReference.size() > 0) {
                attachBindGeneral(elementAt);
            }
            for (int i2 = 0; i2 < expandReference.size(); i2++) {
                attachBind(formInstance.resolveReference(expandReference.elementAt(i2)), elementAt);
            }
        }
        applyControlProperties(formInstance);
    }

    private static void attachBindGeneral(DataBinding dataBinding) {
        TreeReference unpackReference = FormInstance.unpackReference(dataBinding.getReference());
        if (dataBinding.relevancyCondition != null) {
            dataBinding.relevancyCondition.addTarget(unpackReference);
        }
        if (dataBinding.requiredCondition != null) {
            dataBinding.requiredCondition.addTarget(unpackReference);
        }
        if (dataBinding.readonlyCondition != null) {
            dataBinding.readonlyCondition.addTarget(unpackReference);
        }
        if (dataBinding.calculate != null) {
            dataBinding.calculate.addTarget(unpackReference);
        }
    }

    private static void attachBind(TreeElement treeElement, DataBinding dataBinding) {
        treeElement.dataType = dataBinding.getDataType();
        if (dataBinding.relevancyCondition == null) {
            treeElement.setRelevant(dataBinding.relevantAbsolute);
        }
        if (dataBinding.requiredCondition == null) {
            treeElement.setRequired(dataBinding.requiredAbsolute);
        }
        if (dataBinding.readonlyCondition == null) {
            treeElement.setEnabled(!dataBinding.readonlyAbsolute);
        }
        if (dataBinding.constraint != null) {
            treeElement.setConstraint(new Constraint(dataBinding.constraint, dataBinding.constraintMessage));
        }
        treeElement.setPreloadHandler(dataBinding.getPreload());
        treeElement.setPreloadParams(dataBinding.getPreloadParams());
        treeElement.setBindAttributes(dataBinding.getAdditionalAttributes());
    }

    private void applyControlProperties(FormInstance formInstance) {
        TreeReference elementAt;
        int i = 0;
        while (i < 2) {
            Vector<TreeReference> vector = i == 0 ? this.selectOnes : this.selectMultis;
            int i2 = i == 0 ? 7 : 8;
            for (int i3 = 0; i3 < vector.size(); i3++) {
                Vector<TreeReference> expandReference = new EvaluationContext(formInstance).expandReference(vector.elementAt(i3), true);
                for (int i4 = 0; i4 < expandReference.size(); i4++) {
                    TreeElement resolveReference = formInstance.resolveReference(expandReference.elementAt(i4));
                    if (resolveReference.dataType != 7 && resolveReference.dataType != 8) {
                        if (resolveReference.dataType == 0 || resolveReference.dataType == 1) {
                            resolveReference.dataType = i2;
                        } else {
                            System.out.println("Warning! Type incompatible with select question node [" + elementAt.toString() + "] detected!");
                        }
                    }
                }
            }
            i++;
        }
    }

    private static void loadInstanceData(Element element, TreeElement treeElement, FormDef formDef) {
        boolean z;
        int intValue;
        int childCount = element.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            } else if (element.getType(i) == 2) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            Hashtable hashtable = new Hashtable();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (element.getType(i2) == 2) {
                    Element element2 = element.getElement(i2);
                    String name = element2.getName();
                    if (element2.getAttributeValue(NAMESPACE_JAVAROSA, "template") != null) {
                        intValue = -2;
                    } else {
                        Integer num = (Integer) hashtable.get(name);
                        intValue = num == null ? 0 : num.intValue() + 1;
                        hashtable.put(name, new Integer(intValue));
                    }
                    loadInstanceData(element2, treeElement.getChild(name, intValue), formDef);
                }
            }
            return;
        }
        String xMLText = getXMLText(element, true);
        if (xMLText != null && xMLText.trim().length() > 0) {
            treeElement.setValue(XFormAnswerDataParser.getAnswerData(xMLText, treeElement.dataType, ghettoGetQuestionDef(treeElement.dataType, formDef, treeElement.getRef())));
        }
    }

    public static QuestionDef ghettoGetQuestionDef(int i, FormDef formDef, TreeReference treeReference) {
        if (i == 7 || i == 8) {
            return FormDef.findQuestionByRef(treeReference, formDef);
        }
        return null;
    }

    private void checkDependencyCycles() {
        boolean z;
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        Enumeration keys = this._f.triggerIndex.keys();
        while (keys.hasMoreElements()) {
            TreeReference treeReference = (TreeReference) keys.nextElement();
            if (!vector.contains(treeReference)) {
                vector.addElement(treeReference);
            }
            Vector vector3 = (Vector) this._f.triggerIndex.get(treeReference);
            Vector vector4 = new Vector();
            for (int i = 0; i < vector3.size(); i++) {
                Triggerable triggerable = (Triggerable) vector3.elementAt(i);
                for (int i2 = 0; i2 < triggerable.getTargets().size(); i2++) {
                    TreeReference elementAt = triggerable.getTargets().elementAt(i2);
                    if (!vector4.contains(elementAt)) {
                        vector4.addElement(elementAt);
                    }
                }
            }
            for (int i3 = 0; i3 < vector4.size(); i3++) {
                TreeReference treeReference2 = (TreeReference) vector4.elementAt(i3);
                if (!vector.contains(treeReference2)) {
                    vector.addElement(treeReference2);
                }
                vector2.addElement(new TreeReference[]{treeReference, treeReference2});
            }
        }
        while (true) {
            if (vector.size() <= 0) {
                z = true;
                break;
            }
            Vector vector5 = new Vector();
            for (int i4 = 0; i4 < vector.size(); i4++) {
                vector5.addElement(vector.elementAt(i4));
            }
            for (int i5 = 0; i5 < vector2.size(); i5++) {
                vector5.removeElement(((TreeReference[]) vector2.elementAt(i5))[0]);
            }
            if (vector5.size() == 0) {
                z = false;
                break;
            }
            for (int i6 = 0; i6 < vector5.size(); i6++) {
                vector.removeElement((TreeReference) vector5.elementAt(i6));
            }
            for (int size = vector2.size() - 1; size >= 0; size--) {
                if (vector5.contains(((TreeReference[]) vector2.elementAt(size))[1])) {
                    vector2.removeElementAt(size);
                }
            }
        }
        if (!z) {
            System.err.println("XPath Dependency Cycle:");
            for (int i7 = 0; i7 < vector2.size(); i7++) {
                TreeReference[] treeReferenceArr = (TreeReference[]) vector2.elementAt(i7);
                System.err.println(treeReferenceArr[0].toString() + " => " + treeReferenceArr[1].toString());
            }
            throw new RuntimeException("Dependency cycles amongst the xpath expressions in relevant/calculate");
        }
    }

    public static void loadXmlInstance(FormDef formDef, Reader reader) {
        loadXmlInstance(formDef, getXMLDocument(reader));
    }

    public static void loadXmlInstance(FormDef formDef, Document document) {
        TreeElement root = restoreDataModel(document, (Class) null).getRoot();
        TreeElement deepCopy = formDef.getMainInstance().getRoot().deepCopy(true);
        if (!root.getName().equals(deepCopy.getName()) || root.getMult() != 0) {
            throw new RuntimeException("Saved form instance does not match template form definition");
        }
        TreeReference.rootRef().add(deepCopy.getName(), -1);
        deepCopy.populate(root, formDef);
        formDef.getMainInstance().setRoot(deepCopy);
    }

    private static int getDataType(String str) {
        if (str == null) {
            return 0;
        }
        if (str.indexOf(":") != -1) {
            str = str.substring(str.indexOf(":") + 1);
        }
        if (typeMappings.containsKey(str)) {
            return typeMappings.get(str).intValue();
        }
        System.err.println("XForm Parse WARNING: unrecognized data type [" + str + "]");
        return -1;
    }

    public static void addModelPrototype(int i, TreeElement treeElement) {
        modelPrototypes.addNewPrototype(String.valueOf(i), treeElement.getClass());
    }

    public static void addDataType(String str, int i) {
        typeMappings.put(str, new Integer(i));
    }

    public static void registerControlType(String str, final int i) {
        IElementHandler iElementHandler = new IElementHandler() { // from class: org.javarosa.xform.parse.XFormParser.13
            @Override // org.javarosa.xform.parse.IElementHandler
            public void handle(XFormParser xFormParser, Element element, Object obj) {
                xFormParser.parseControl((IFormElement) obj, element, i);
            }
        };
        topLevelHandlers.put(str, iElementHandler);
        groupLevelHandlers.put(str, iElementHandler);
    }

    public static void registerHandler(String str, IElementHandler iElementHandler) {
        topLevelHandlers.put(str, iElementHandler);
        groupLevelHandlers.put(str, iElementHandler);
    }

    public static String getXMLText(Node node, boolean z) {
        if (node.getChildCount() == 0) {
            return null;
        }
        return getXMLText(node, 0, z);
    }

    public static String getXMLText(Node node, int i, boolean z) {
        StringBuffer stringBuffer = null;
        String text = node.getText(i);
        if (text == null) {
            return null;
        }
        for (int i2 = i + 1; i2 < node.getChildCount() && node.getType(i2) == 4; i2++) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer(text);
            }
            stringBuffer.append(node.getText(i2));
        }
        String stringBuffer2 = stringBuffer != null ? stringBuffer.toString() : text;
        if (z) {
            return stringBuffer2.trim();
        }
        return stringBuffer2;
    }

    public static FormInstance restoreDataModel(InputStream inputStream, Class cls) {
        Document xMLDocument = getXMLDocument(new InputStreamReader(inputStream));
        if (xMLDocument == null) {
            throw new RuntimeException("syntax error in XML instance; could not parse");
        }
        return restoreDataModel(xMLDocument, cls);
    }

    public static FormInstance restoreDataModel(Document document, Class cls) {
        Restorable restorable = cls != null ? (Restorable) PrototypeFactory.getInstance(cls) : null;
        Element rootElement = document.getRootElement();
        TreeElement buildInstanceStructure = buildInstanceStructure(rootElement, null);
        FormInstance formInstance = new FormInstance(buildInstanceStructure);
        loadNamespaces(rootElement, formInstance);
        if (restorable != null) {
            RestoreUtils.templateData(restorable, formInstance, null);
        }
        loadInstanceData(rootElement, buildInstanceStructure, null);
        return formInstance;
    }

    public static FormInstance restoreDataModel(byte[] bArr, Class cls) {
        return restoreDataModel(new ByteArrayInputStream(bArr), cls);
    }

    public static String getVagueLocation(Element element) {
        String str;
        Element element2 = element;
        String name = element.getName();
        while (element2 != null) {
            Node parent = element2.getParent();
            if (parent instanceof Element) {
                element2 = (Element) parent;
                String name2 = element2.getName();
                for (int i = 0; i < element2.getAttributeCount(); i++) {
                    name2 = (name2 + "[@" + element2.getAttributeName(i) + "=") + element2.getAttributeValue(i) + "]";
                }
                str = name2 + "/" + name;
            } else {
                element2 = null;
                str = "/" + name;
            }
            name = str;
        }
        return ("\n    Problem found at nodeset: " + name) + "\n    With element " + getVagueElementPrintout(element, 2) + "\n";
    }

    public static String getVagueElementPrintout(Element element, int i) {
        String str = "<" + element.getName();
        for (int i2 = 0; i2 < element.getAttributeCount(); i2++) {
            str = (str + XFormAnswerDataSerializer.DELIMITER + element.getAttributeName(i2) + "=\"") + element.getAttributeValue(i2) + "\"";
        }
        if (element.getChildCount() > 0) {
            String str2 = str + ">";
            if (element.getType(0) == 2) {
                if (i > 0) {
                    return str2 + getVagueElementPrintout((Element) element.getChild(0), i - 1);
                }
                return str2 + "...";
            }
            return str2;
        }
        return str + "/>";
    }
}
