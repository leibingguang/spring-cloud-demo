package com.ellison.boot.annotation.importselector;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * TODO
 *
 * @author leibingguang
 * @since 10/21/20 3:43 PM
 */
public class MyImportSelector implements DeferredImportSelector {
    @Override public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{MyConfiguration1.class.getName(), MyConfiguration2.class.getName(),
                MyConfiguration3.class.getName()};
    }
}
