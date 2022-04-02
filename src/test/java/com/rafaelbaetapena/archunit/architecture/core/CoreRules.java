package com.rafaelbaetapena.archunit.architecture.core;

import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.rafaelbaetapena.archunit.architecture.OtherPackagesConstants.javaDeepPackageIdentifier;
import static com.rafaelbaetapena.archunit.architecture.OtherPackagesConstants.springDeepPackageIdentifier;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

public class CoreRules {
    public static String packageIdentifier = "..core";
    public static String deepPackageIdentifier = "..core..";

    @ArchTest
    public static final ArchRule noClassesShouldResideInPackage = noClasses()
            .should().resideInAPackage(packageIdentifier);

    @ArchTest
    public static final ArchRule classesShouldOnlyDependOnClassesThatResideIn = classes()
            .that().resideInAPackage(deepPackageIdentifier)
            .should().onlyDependOnClassesThat().resideInAnyPackage(
                    deepPackageIdentifier,
                    javaDeepPackageIdentifier,
                    springDeepPackageIdentifier
            );
}
