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
package org.wso2.carbon.identity.api.server.branding.preference.management.v1.core.functions;

import org.wso2.carbon.identity.api.server.branding.preference.management.v1.model.TenantPreferenceModel;
import org.wso2.carbon.identity.branding.preference.mgt.model.Theme;

import java.util.function.Function;

/**
 * Converts TenantPreferenceModel API model to Theme.
 */
public class ApiModelToTheme implements Function<TenantPreferenceModel, Theme> {

    @Override
    public Theme apply(TenantPreferenceModel apiModel) {

        Theme theme = new Theme();
        theme.setHeaderText(apiModel.getHeaderText());
        theme.setFooterText(apiModel.getFooterText());
        theme.setTitleText(apiModel.getTitleText());
        theme.setLogo(apiModel.getLogo());
        theme.setFavicon(apiModel.getFavicon());
        theme.setPrimaryColorCode(apiModel.getPrimaryColor());
        theme.setBackgroundColorCode(apiModel.getBackgroundColor());
        theme.setThemePath(apiModel.getThemeFile());
        return theme;
    }
}
