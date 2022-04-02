package com.rafaelbaetapena.archunit.architecture.entrypoint;

import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

public class EntrypointRules {
    public static String packageIdentifier = "..entrypoint";
    public static String deepPackageIdentifier = "..entrypoint..";

    @ArchTest
    public static final ArchRule noClassesShouldResideInPackageEntrypoint = noClasses()
            .should().resideInAPackage(packageIdentifier);
}
