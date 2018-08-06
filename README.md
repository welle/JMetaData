# JMetaData [![Build Status](https://travis-ci.org/welle/JMetaData.svg?branch=master)](https://travis-ci.org/welle/JMetaData) [![quality gate](https://sonarcloud.io/api/project_badges/measure?project=aka.jmetadata%3AJMetaData&metric=alert_status)](https://sonarcloud.io/dashboard?id=aka.jmetadata%3AJMetaData) #

## Quick summary ##

JMetaData is a wrapper using JNA lib to access [MediaInfo](http://mediaarea.net/en/MediaInfo) library to collect video metadata. 

You can either let the JMetaData lib load its own dll or use yours.

Current version support windows 32/64 bits and mac OS. Linux is not currently supported.

## How to use it ##

In the class aka.jmetadata.test.Examples.java you'll find a comprehensive example of how to use it.

### Version

Go to [my maven repository](https://github.com/welle/maven-repository) to get the latest version.

## Notes
Need the eclipse-external-annotations-m2e-plugin: 

p2 update site to install this from: http://www.lastnpe.org/eclipse-external-annotations-m2e-plugin-p2-site/ (The 404 is normal, just because there is no index.html; it will work in Eclipse.)