package org.daimhim.dii

import com.android.build.api.transform.QualifiedContent
import com.android.build.api.transform.Transform
import com.android.build.gradle.external.cmake.server.Project
import org.gradle.api.Plugin


class DII extends Transform implements Plugin<Project> {

    @Override
    String getName() {
        return null
    }

    @Override
    Set<QualifiedContent.ContentType> getInputTypes() {
        return null
    }

    @Override
    Set<? super QualifiedContent.Scope> getScopes() {
        return null
    }

    @Override
    boolean isIncremental() {
        return false
    }

    @Override
    void apply(Project project) {

    }
}