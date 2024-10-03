package com.ashburncode.hellonebula;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
        // System.getProperties().list(System.out);
        String javaVendor=System.getProperty("java.vendor");  // example Oracle Corporation
        String javaVmVersion=System.getProperty("java.vm.version");  // example 17.0.7+8-LTS-224
        String retval = "Greetings from Hello Nebula java.vendor = " + javaVendor + " java.vm.version = " + javaVmVersion;
		// return "Greetings from Spring Boot!";
        return retval;
	}

}

// java.specification.version=17
// java.vm.vendor=Oracle Corporation
// java.vendor.url=https://java.oracle.com/
// java.vm.specification.version=17
// os.name=Windows 11
// sun.boot.library.path=C:\LocalApps\jdk-17.0.7\bin
// java.specification.vendor=Oracle Corporation
// java.version.date=2023-04-18
// java.home=C:\LocalApps\jdk-17.0.7
// java.vm.specification.vendor=Oracle Corporation
// java.specification.name=Java Platform API Specification
// java.runtime.version=17.0.7+8-LTS-224
// os.version=10.0
// java.runtime.name=Java(TM) SE Runtime Environment
// java.vm.name=Java HotSpot(TM) 64-Bit Server VM
// java.version=17.0.7
// os.arch=amd64
// java.vm.specification.name=Java Virtual Machine Specification
// java.library.path=C:\LocalApps\jdk-17.0.7\bin;C:\WINDOW...
// java.vm.info=mixed mode, emulated-client, sharing
// java.vendor=Oracle Corporation
// java.vm.version=17.0.7+8-LTS-224
// java.class.version=61.0
