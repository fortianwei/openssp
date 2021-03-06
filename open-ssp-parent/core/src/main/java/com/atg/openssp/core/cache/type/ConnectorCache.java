package com.atg.openssp.core.cache.type;

import com.atg.openssp.common.cache.ListCache;
import com.atg.openssp.core.exchange.channel.rtb.OpenRtbConnector;

/**
 * @author André Schmer
 *
 */
public final class ConnectorCache extends ListCache<OpenRtbConnector> {

	public static final ConnectorCache instance = new ConnectorCache();

	private ConnectorCache() {
		super();
	}

}
