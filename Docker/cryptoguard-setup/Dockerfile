# syntax=docker/dockerfile:1
FROM ubuntu:20.04
ARG DEBIAN_FRONTEND=noninteractive
RUN apt-get update
RUN apt-get -q -y install android-sdk openjdk-8-jdk git gradle python3 python-is-python3 python3-nbformat wget
ENV JAVA_HOME=JAVA_HOME=/usr/lib/jvm/java-8-openjdk-arm64/jre 
ENV ANDROID_HOME=/usr/lib/android-sdk
RUN cd /root && git clone https://github.com/CryptoGuardOSS/cryptoguard.git
RUN cd root/cryptoguard/ && ./gradlew clean build
