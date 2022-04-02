package com.rafaelbaetapena.archunit.architecture.gateway;

import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

public class GatewayRules {
    public static String packageIdentifier = "..gateway";
    public static String deepPackageIdentifier = "..gateway..";

    @ArchTest
    public static final ArchRule noClassesShouldResideInPackage = noClasses()
            .should().resideInAPackage(packageIdentifier);
}
