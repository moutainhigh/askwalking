package com.cloud.askwalking.gateway.pipline.context.api;

import com.cloud.askwalking.client.exception.ErrorCode;
import com.cloud.askwalking.core.constants.GatewayConstant;
import com.cloud.askwalking.core.context.GatewayInvokeContext;
import com.cloud.askwalking.gateway.pipline.AbstractGatewayContextHandler;
import com.cloud.askwalking.gateway.pipline.CommonParamParse;
import com.google.common.collect.Sets;
import lombok.extern.slf4j.Slf4j;

import java.util.Set;

/**
 * @author niuzhiwei
 */
@Slf4j
public class ParamParseContextHandler extends AbstractGatewayContextHandler {

    private final Set<String> handleTypes = Sets.newHashSet(GatewayConstant.API);

    @Override
    public boolean handleGatewayInvoke(GatewayInvokeContext gatewayInvokeContext) {
        boolean result;
        try {
            result = CommonParamParse.handleParamParse(gatewayInvokeContext);
        } catch (Exception e) {
            return putDebugErrorResult(gatewayInvokeContext, ErrorCode.PARAM_ERROR);
        }
        return result;
    }


    @Override
    public Set<String> handleType() {
        return this.handleTypes;
    }

    @Override
    public int getOrder() {
        return 10;
    }
}
