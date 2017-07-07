# JMetaData #
[![Build Status](https://travis-ci.org/welle/JMetaData.svg?branch=master)](https://travis-ci.org/welle/JMetaData)
[![Quality Gate](https://sonarcloud.io/api/badges/gate?key=JMetaData)](https://sonarcloud.io/dashboard/index/JMetaData)

## Quick summary ##

JmetaData is a wrapper using JNA lib to access [MediaInfo](http://mediaarea.net/en/MediaInfo) library to collect video metadata. 

You can either let the JMetaData lib load its own dll or use yours.

Current version support windows 32/64 bits and mac OS. Linux is not currently supported.

## How to use it ##

In the class aka.jmetadata.test.Examples.java you'll find a comprehensive example of how to use it.

Javadoc is available in source folders. 

### Dependencies ###

* [JNA v3.0.9](https://github.com/twall/jna)
version 3.0.9 of the lib is available in this repository. 
* Swissknife also available in this repository.
* JSR 305 for annotations code.
