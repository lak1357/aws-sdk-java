/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codebuild.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;

import com.amazonaws.protocol.json.*;

/**
 * ProjectArtifactsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectArtifactsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ProjectArtifacts projectArtifacts, StructuredJsonGenerator jsonGenerator) {

        if (projectArtifacts == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (projectArtifacts.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(projectArtifacts.getType());
            }
            if (projectArtifacts.getLocation() != null) {
                jsonGenerator.writeFieldName("location").writeValue(projectArtifacts.getLocation());
            }
            if (projectArtifacts.getPath() != null) {
                jsonGenerator.writeFieldName("path").writeValue(projectArtifacts.getPath());
            }
            if (projectArtifacts.getNamespaceType() != null) {
                jsonGenerator.writeFieldName("namespaceType").writeValue(projectArtifacts.getNamespaceType());
            }
            if (projectArtifacts.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(projectArtifacts.getName());
            }
            if (projectArtifacts.getPackaging() != null) {
                jsonGenerator.writeFieldName("packaging").writeValue(projectArtifacts.getPackaging());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ProjectArtifactsJsonMarshaller instance;

    public static ProjectArtifactsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProjectArtifactsJsonMarshaller();
        return instance;
    }

}
