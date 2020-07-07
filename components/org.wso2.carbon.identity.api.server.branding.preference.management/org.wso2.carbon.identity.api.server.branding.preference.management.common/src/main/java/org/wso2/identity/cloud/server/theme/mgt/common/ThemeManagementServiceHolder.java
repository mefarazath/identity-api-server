/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.identity.cloud.server.theme.mgt.common;

import org.wso2.carbon.identity.branding.preference.mgt.ThemeManagementService;

/**
 * ThemeManagementService OSGi service holder.
 */
public class ThemeManagementServiceHolder {

    private ThemeManagementServiceHolder() {

    }

    private static ThemeManagementService themeManagementService;

    public static ThemeManagementService getThemeManagementService() {

        return themeManagementService;
    }

    public static void setThemeManagementService(ThemeManagementService themeManagementService) {

        ThemeManagementServiceHolder.themeManagementService = themeManagementService;
    }
}
