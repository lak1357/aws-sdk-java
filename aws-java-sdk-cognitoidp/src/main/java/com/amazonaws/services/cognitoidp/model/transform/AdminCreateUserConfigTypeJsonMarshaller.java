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
package com.amazonaws.services.cognitoidp.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.json.*;

/**
 * AdminCreateUserConfigTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdminCreateUserConfigTypeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AdminCreateUserConfigType adminCreateUserConfigType, StructuredJsonGenerator jsonGenerator) {

        if (adminCreateUserConfigType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (adminCreateUserConfigType.getAllowAdminCreateUserOnly() != null) {
                jsonGenerator.writeFieldName("AllowAdminCreateUserOnly").writeValue(adminCreateUserConfigType.getAllowAdminCreateUserOnly());
            }
            if (adminCreateUserConfigType.getUnusedAccountValidityDays() != null) {
                jsonGenerator.writeFieldName("UnusedAccountValidityDays").writeValue(adminCreateUserConfigType.getUnusedAccountValidityDays());
            }
            if (adminCreateUserConfigType.getInviteMessageTemplate() != null) {
                jsonGenerator.writeFieldName("InviteMessageTemplate");
                MessageTemplateTypeJsonMarshaller.getInstance().marshall(adminCreateUserConfigType.getInviteMessageTemplate(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AdminCreateUserConfigTypeJsonMarshaller instance;

    public static AdminCreateUserConfigTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AdminCreateUserConfigTypeJsonMarshaller();
        return instance;
    }

}
