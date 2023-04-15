package com.rafaelbaetapena.archunit.architecture;

import com.rafaelbaetapena.archunit.architecture.core.CoreRules;
import com.rafaelbaetapena.archunit.architecture.entrypoint.EntrypointRules;
import com.rafaelbaetapena.archunit.architecture.gateway.GatewayRules;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchTests;

@AnalyzeClasses(importOptions = {
        ImportOption.DoNotIncludeTests.class,
        ImportOption.DoNotIncludeJars.class,
        ImportOption.DoNotIncludeArchives.class
},
packages = "com.rafaelbaetapena.archunit")
public class ArchitectureTest {
//    @ArchTest
//    static final ArchTests coreTests = ArchTests.in(CoreRules.class);
//
//    @ArchTest
//    static final ArchTests entrypointTests = ArchTests.in(EntrypointRules.class);
//
//    @ArchTest
//    static final ArchTests gatewayTests = ArchTests.in(GatewayRules.class);
}
