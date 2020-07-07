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
package org.wso2.identity.cloud.server.theme.mgt.v1.core.functions;

import org.wso2.carbon.identity.branding.preference.mgt.model.Theme;
import org.wso2.identity.cloud.server.theme.mgt.v1.model.TenantPreferenceModel;

import java.util.function.Function;

/**
 * Converts Theme to TenantPreferenceModel API model.
 */
public class ThemeToApiModel implements Function<Theme, TenantPreferenceModel> {

    @Override
    public TenantPreferenceModel apply(Theme theme) {

        return new TenantPreferenceModel()
                .headerText(theme.getHeaderText())
                .footerText(theme.getFooterText())
                .titleText(theme.getTitleText())
                .logo(theme.getLogo())
                .favicon(theme.getFavicon())
                .primaryColor(theme.getPrimaryColorCode())
                .backgroundColor(theme.getBackgroundColorCode())
                .themeFile(theme.getThemePath());
    }
}
