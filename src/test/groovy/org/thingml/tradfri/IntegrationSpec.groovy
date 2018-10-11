package org.thingml.tradfri

import spock.lang.Shared
import spock.lang.Specification

class IntegrationSpec extends Specification {
    def "test"() {
        when:
        def a = 1

        then:
        true
    }

    def setupSpec() {
        gateway.initCoap();
        gateway.discovery();

        bulbs = gateway.bulbs
        for (LightBulb bulb : bulbs) {
            bulb.updateBulb()
            println(bulb.toString())
        }

        remotes = gateway.remotes
        for (Remote remote : remotes) {
            println remote.id
        }
    }

    @Shared config = new GatewayConfiguration()
    @Shared gateway = new TradfriGateway(config.gatewayIp, config.securityKey)
    @Shared bulbs, remotes
}
