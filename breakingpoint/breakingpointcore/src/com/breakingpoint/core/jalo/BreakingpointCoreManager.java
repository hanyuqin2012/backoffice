package com.breakingpoint.core.jalo;

import com.breakingpoint.core.constants.BreakingpointCoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class BreakingpointCoreManager extends GeneratedBreakingpointCoreManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( BreakingpointCoreManager.class.getName() );
	
	public static final BreakingpointCoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (BreakingpointCoreManager) em.getExtension(BreakingpointCoreConstants.EXTENSIONNAME);
	}
	
}
