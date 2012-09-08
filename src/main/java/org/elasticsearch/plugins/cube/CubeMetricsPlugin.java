package org.elasticsearch.plugins.cube;

import org.elasticsearch.client.Client;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.logging.ESLogger;
import org.elasticsearch.common.logging.Loggers;
import org.elasticsearch.plugins.AbstractPlugin;

public class CubeMetricsPlugin extends AbstractPlugin {
	private static final ESLogger log=Loggers.getLogger(CubeMetricsPlugin.class);
	
	@Inject
	public CubeMetricsPlugin(Client client){
		log.info("Starting Cube metrics plugin");
		log.info("Registered client: " + client);
		if(client != null){
			log.info("client is not null");
		}
	}
	
	@Override
	public String name() {
		return "cube-plugin";
	}

	@Override
	public String description() {
		return "Cube metrics plugin.";
	}

}
