SAMI Trials Java SDK
====================

This SDK helps you connect your Java apps to SAMI Trials. The SDK exposes a number of methods to easily execute REST API calls to SAMI Trials. 

Prerequisites
-------------

 * [Eclipse](https://www.eclipse.org/) 
 * [Maven Integration for Eclipse](https://www.eclipse.org/m2e/) or [Maven](http://maven.apache.org/)
 * Wordnik
 * Jackson JSON Processor  2.1.4
 * JUnit 4.8.1
 * Apache HTTP Client 4.0
 
The SDK was developed with Eclipse and Maven and tested with JDK 7. When building Maven will fetch the correct libraries. You might be able to build the SDK in a different environment and we would be happy to hear about your (success) stories.

If you need to exercise core SAMI functionality, then you need to import the [sami-java](https://github.com/samsungsamiio/sami-java) SDK as well. 

Installation
---------------------

In Eclipse, 
- import the SDK library project as "Existing Maven Projects".
- right click the project, and choose "Run As" then "Maven install"

After the installation succeeds, you can use the generated libraries in one of the following ways depending on your scenario:

- To use them in an Android project, copy libraries under `target` and `target/lib` directories of the imported Maven project to `libs` directory in your Android project.
- To use them in your Maven project, modify `pom.xml` file in your project to add dependency to samitrials-java-xxx.jar under `target` of the imported Maven project as following

~~~
<dependency>
   <groupId>io.samsungsami.trials</groupId>
   <artifactId>samitrials-java</artifactId>
   <version>the actual version number</version>
</dependency>
~~~

You're ready to go.

More about SAMI
---------------

If you are not familiar with SAMI we have extensive documentation at http://developer.samsungsami.io

The full SAMI API specification with examples can be found at http://developer.samsungsami.io/sami/api-spec.html

We blog about advanced sample applications at http://blog.samsungsami.io/

To create and manage your services and devices on SAMI visit developer portal at http://devportal.samsungsami.io

License and Copyright
---------------------

Licensed under the Apache License. See LICENSE.

Copyright (c) 2015 Samsung Electronics Co., Ltd.
