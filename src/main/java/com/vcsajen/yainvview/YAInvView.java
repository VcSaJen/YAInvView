package com.vcsajen.yainvview;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.plugin.PluginContainer;

/**
 * Main plugin class
 * Created by VcSaJen on 15.12.2016 20:53.
 */
@Plugin(id = "yainvview", name = "YAInvView", version = "1.0.0", authors = {"VcSaJen"},
        description = "Yet another inventory viewer and editor", dependencies = {})
public class YAInvView {
    @Inject
    private Logger logger;

    @Inject
    private Game game;

    @Inject
    private PluginContainer myPlugin;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        logger.debug("!!!!!!!!!!!!!!!!!!!!!!!!");
        logger.debug("! YAInvView is online. !");
        logger.debug("!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
