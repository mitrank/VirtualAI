# VirtualAI
A virtual assistant made using Java

-------------------------------------------------------------

This uses Sphinx4, a pure Java speech recognition library. 
It provides a quick and easy API to convert the speech recordings into text with the help of CMUSphinx acoustic models. It can be used on servers and in desktop applications. Besides speech recognition, Sphinx4 helps to identify speakers, to adapt models, to align existing transcription to audio for timestamping and more.

Sphinx4 supports US English and many other languages.

-------------------------------------------------------------

## Sphinx4 Core & Data JARs:
For this project we require the core and data JAR files of this library which is available via the link provided below

Core- https://jar-download.com/?search_box=sphinx4-core

Data- https://jar-download.com/?search_box=sphinx4-data+jar

We then export these external JAR files in our project and use the required features.

-------------------------------------------------------------

## Sphinx Knowledge Base Generator:
The text mentioned in 'corpus.txt' file is uploaded to the site mentioned below- 

http://www.speech.cs.cmu.edu/tools/lmtool-new.html

And accordingly, the required '.dic' and '.lm' are imported in the project which are used for dictionary and language purpose.
