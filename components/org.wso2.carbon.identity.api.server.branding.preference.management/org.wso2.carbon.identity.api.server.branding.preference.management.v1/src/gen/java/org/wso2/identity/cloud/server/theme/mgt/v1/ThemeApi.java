/*
* Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.identity.cloud.server.theme.mgt.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;
import java.io.InputStream;

import org.wso2.identity.cloud.server.theme.mgt.v1.model.Error;
import org.wso2.identity.cloud.server.theme.mgt.v1.model.TenantPreferenceModel;
import org.wso2.identity.cloud.server.theme.mgt.v1.ThemeApiService;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import io.swagger.annotations.*;

import javax.validation.constraints.*;

@Path("/theme")
@Api(description = "The theme API")

public class ThemeApi  {

    @Autowired
    private ThemeApiService delegate;

    @Valid
    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get theme preference.", notes = "Retrieve tenant using the tenant ID.  <b>Permission required:</b> * /permission/protected/manage/monitor/tenants  <b>scope required:</b> * ", response = TenantPreferenceModel.class, authorizations = {
        @Authorization(value = "BasicAuth"),
        @Authorization(value = "OAuth2", scopes = {
            
        })
    }, tags={ "Theme", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = TenantPreferenceModel.class),
        @ApiResponse(code = 400, message = "Invalid Input Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Resource Forbidden", response = Void.class),
        @ApiResponse(code = 404, message = "The specified resource is not found", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class)
    })
    public Response getTheme() {

        return delegate.getTheme();
    }

    @Valid
    @PUT
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update theme preferences.", notes = "This API activates/deactivates the specified tenant.  <b>Permission required:</b> * /permission/protected/manage/modify/tenants  <b>scope required:</b> * internal_modify_tenants ", response = Void.class, authorizations = {
        @Authorization(value = "BasicAuth"),
        @Authorization(value = "OAuth2", scopes = {
            
        })
    }, tags={ "Theme" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully updated", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid Input Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        @ApiResponse(code = 403, message = "Resource Forbidden", response = Void.class),
        @ApiResponse(code = 409, message = "Element Already Exists", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class)
    })
    public Response updateTheme(@ApiParam(value = "This represents the tenant to be updated." ,required=true) @Valid TenantPreferenceModel tenantPreferenceModel) {

        return delegate.updateTheme(tenantPreferenceModel );
    }

}
