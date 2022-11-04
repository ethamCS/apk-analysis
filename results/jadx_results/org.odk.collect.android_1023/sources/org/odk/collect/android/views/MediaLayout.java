package org.odk.collect.android.views;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import org.javarosa.core.model.FormIndex;
import org.javarosa.core.reference.InvalidReferenceException;
import org.javarosa.core.reference.ReferenceManager;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.utilities.FileUtils;
import org.odk.collect.android.widgets.QuestionWidget;
/* loaded from: classes.dex */
public class MediaLayout extends RelativeLayout {
    private static final String t = "AVTLayout";
    private String mSelectionDesignator;
    private String mVideoURI = null;
    private TextView mView_Text = null;
    private AudioButton mAudioButton = null;
    private ImageView mImageView = null;
    private TextView mMissingImage = null;
    private ImageButton mVideoButton = null;
    private FormIndex mIndex = null;

    public MediaLayout(Context c) {
        super(c);
    }

    public void playAudio() {
        if (this.mAudioButton != null) {
            this.mAudioButton.playAudio();
        }
    }

    public void playVideo() {
        if (this.mVideoURI != null) {
            String videoFilename = "";
            try {
                videoFilename = ReferenceManager._().DeriveReference(this.mVideoURI).getLocalURI();
            } catch (InvalidReferenceException e) {
                Log.e(t, "Invalid reference exception");
                e.printStackTrace();
            }
            File videoFile = new File(videoFilename);
            if (!videoFile.exists()) {
                String errorMsg = getContext().getString(R.string.file_missing, videoFilename);
                Log.e(t, errorMsg);
                Toast.makeText(getContext(), errorMsg, 1).show();
                return;
            }
            Intent i = new Intent("android.intent.action.VIEW");
            i.setDataAndType(Uri.fromFile(videoFile), "video/*");
            try {
                ((Activity) getContext()).startActivity(i);
            } catch (ActivityNotFoundException e2) {
                Toast.makeText(getContext(), getContext().getString(R.string.activity_not_found, "view video"), 0).show();
            }
        }
    }

    public void setAVT(FormIndex index, String selectionDesignator, TextView text, String audioURI, String imageURI, String videoURI, final String bigImageURI) {
        this.mSelectionDesignator = selectionDesignator;
        this.mIndex = index;
        this.mView_Text = text;
        this.mView_Text.setId(QuestionWidget.newUniqueId());
        this.mVideoURI = videoURI;
        RelativeLayout.LayoutParams textParams = new RelativeLayout.LayoutParams(-2, -2);
        RelativeLayout.LayoutParams audioParams = new RelativeLayout.LayoutParams(-2, -2);
        RelativeLayout.LayoutParams imageParams = new RelativeLayout.LayoutParams(-2, -2);
        RelativeLayout.LayoutParams videoParams = new RelativeLayout.LayoutParams(-2, -2);
        if (audioURI != null) {
            this.mAudioButton = new AudioButton(getContext(), this.mIndex, this.mSelectionDesignator, audioURI);
            this.mAudioButton.setId(QuestionWidget.newUniqueId());
        }
        if (videoURI != null) {
            this.mVideoButton = new ImageButton(getContext());
            this.mVideoButton.setImageBitmap(BitmapFactory.decodeResource(getContext().getResources(), 17301540));
            this.mVideoButton.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.views.MediaLayout.1
                @Override // android.view.View.OnClickListener
                public void onClick(View v) {
                    Collect.getInstance().getActivityLogger().logInstanceAction(this, "onClick", "playVideoPrompt" + MediaLayout.this.mSelectionDesignator, MediaLayout.this.mIndex);
                    MediaLayout.this.playVideo();
                }
            });
            this.mVideoButton.setId(QuestionWidget.newUniqueId());
        }
        String errorMsg = null;
        int imageId = QuestionWidget.newUniqueId();
        if (imageURI != null) {
            try {
                String imageFilename = ReferenceManager._().DeriveReference(imageURI).getLocalURI();
                File imageFile = new File(imageFilename);
                if (imageFile.exists()) {
                    Display display = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
                    int screenWidth = display.getWidth();
                    int screenHeight = display.getHeight();
                    Bitmap b = FileUtils.getBitmapScaledToDisplay(imageFile, screenHeight, screenWidth);
                    if (b != null) {
                        this.mImageView = new ImageView(getContext());
                        this.mImageView.setPadding(2, 2, 2, 2);
                        this.mImageView.setBackgroundColor(-1);
                        this.mImageView.setImageBitmap(b);
                        this.mImageView.setId(imageId);
                        if (bigImageURI != null) {
                            this.mImageView.setOnClickListener(new View.OnClickListener() { // from class: org.odk.collect.android.views.MediaLayout.2
                                File bigImage;
                                String bigImageFilename;

                                {
                                    MediaLayout.this = this;
                                    this.bigImageFilename = ReferenceManager._().DeriveReference(bigImageURI).getLocalURI();
                                    this.bigImage = new File(this.bigImageFilename);
                                }

                                @Override // android.view.View.OnClickListener
                                public void onClick(View v) {
                                    Collect.getInstance().getActivityLogger().logInstanceAction(this, "onClick", "showImagePromptBigImage" + MediaLayout.this.mSelectionDesignator, MediaLayout.this.mIndex);
                                    Intent i = new Intent("android.intent.action.VIEW");
                                    i.setDataAndType(Uri.fromFile(this.bigImage), "image/*");
                                    try {
                                        MediaLayout.this.getContext().startActivity(i);
                                    } catch (ActivityNotFoundException e) {
                                        Toast.makeText(MediaLayout.this.getContext(), MediaLayout.this.getContext().getString(R.string.activity_not_found, "view image"), 0).show();
                                    }
                                }
                            });
                        }
                    } else {
                        errorMsg = getContext().getString(R.string.file_invalid, imageFile);
                    }
                } else {
                    errorMsg = getContext().getString(R.string.file_missing, imageFile);
                }
                if (errorMsg != null) {
                    Log.e(t, errorMsg);
                    this.mMissingImage = new TextView(getContext());
                    this.mMissingImage.setText(errorMsg);
                    this.mMissingImage.setPadding(10, 10, 10, 10);
                    this.mMissingImage.setId(imageId);
                }
            } catch (InvalidReferenceException e) {
                Log.e(t, "image invalid reference exception");
                e.printStackTrace();
            }
        }
        if (this.mView_Text.getText().length() == 0 && (this.mImageView != null || this.mMissingImage != null)) {
            if (this.mImageView != null) {
                this.mImageView.setScaleType(ImageView.ScaleType.FIT_START);
            }
            textParams.addRule(10);
            textParams.addRule(9);
            imageParams.addRule(1, this.mView_Text.getId());
            imageParams.addRule(10);
            if (this.mAudioButton != null && this.mVideoButton == null) {
                audioParams.addRule(10);
                audioParams.addRule(11);
                imageParams.addRule(0, this.mAudioButton.getId());
            } else if (this.mAudioButton == null && this.mVideoButton != null) {
                videoParams.addRule(10);
                videoParams.addRule(11);
                imageParams.addRule(0, this.mVideoButton.getId());
            } else if (this.mAudioButton != null && this.mVideoButton != null) {
                audioParams.addRule(10);
                audioParams.addRule(11);
                imageParams.addRule(0, this.mAudioButton.getId());
                videoParams.addRule(11);
                videoParams.addRule(3, this.mAudioButton.getId());
                imageParams.addRule(0, this.mVideoButton.getId());
            } else {
                imageParams.addRule(11);
            }
            imageParams.addRule(12);
        } else {
            if (this.mImageView != null) {
                this.mImageView.setScaleType(ImageView.ScaleType.FIT_START);
            }
            textParams.addRule(9);
            textParams.addRule(10);
            if (this.mAudioButton != null && this.mVideoButton == null) {
                audioParams.addRule(11);
                textParams.addRule(0, this.mAudioButton.getId());
            } else if (this.mAudioButton == null && this.mVideoButton != null) {
                videoParams.addRule(11);
                textParams.addRule(0, this.mVideoButton.getId());
            } else if (this.mAudioButton != null && this.mVideoButton != null) {
                audioParams.addRule(11);
                textParams.addRule(0, this.mAudioButton.getId());
                videoParams.addRule(11);
                videoParams.addRule(3, this.mAudioButton.getId());
            } else {
                textParams.addRule(11);
            }
            if (this.mImageView != null || this.mMissingImage != null) {
                imageParams.addRule(12);
                imageParams.addRule(14);
                imageParams.addRule(3, this.mView_Text.getId());
            } else {
                textParams.addRule(12);
            }
        }
        addView(this.mView_Text, textParams);
        if (this.mAudioButton != null) {
            addView(this.mAudioButton, audioParams);
        }
        if (this.mVideoButton != null) {
            addView(this.mVideoButton, videoParams);
        }
        if (this.mImageView != null) {
            addView(this.mImageView, imageParams);
        } else if (this.mMissingImage != null) {
            addView(this.mMissingImage, imageParams);
        }
    }

    public void addDivider(ImageView v) {
        RelativeLayout.LayoutParams dividerParams = new RelativeLayout.LayoutParams(-1, -2);
        if (this.mImageView != null) {
            dividerParams.addRule(3, this.mImageView.getId());
        } else if (this.mMissingImage != null) {
            dividerParams.addRule(3, this.mMissingImage.getId());
        } else if (this.mVideoButton != null) {
            dividerParams.addRule(3, this.mVideoButton.getId());
        } else if (this.mAudioButton != null) {
            dividerParams.addRule(3, this.mAudioButton.getId());
        } else if (this.mView_Text != null) {
            dividerParams.addRule(3, this.mView_Text.getId());
        } else {
            Log.e(t, "Tried to add divider to uninitialized ATVWidget");
            return;
        }
        addView(v, dividerParams);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        if (visibility != 0 && this.mAudioButton != null) {
            this.mAudioButton.stopPlaying();
        }
    }
}
