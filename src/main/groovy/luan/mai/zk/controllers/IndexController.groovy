package luan.mai.zk.controllers

import org.zkoss.bind.annotation.Init
import org.zkoss.zk.ui.select.annotation.VariableResolver
import org.zkoss.zk.ui.select.annotation.WireVariable
import org.zkoss.zkplus.spring.DelegatingVariableResolver

@VariableResolver(DelegatingVariableResolver.class)
class IndexController {

    @WireVariable("simpleBean")
    def simpleBean

    @WireVariable("applicationConfig")
    def applicationConfig

    def message

    @Init
    def init() {
        message = applicationConfig.message
    }
}
