package com.decodedhealth.flutter_zoom_plugin;

import io.flutter.plugin.common.PluginRegistry.Registrar;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import androidx.annotation.NonNull;

/** FlutterZoomPlugin */
public class FlutterZoomPlugin {

  /** Plugin registration. */
  /**public static void registerWith(Registrar registrar) {
    registrar.platformViewRegistry().registerViewFactory("flutter_zoom_plugin", new ZoomViewFactory(registrar.messenger()));
  } */
  
  
  @Override
  public void onAttachedToEngine(@NonNull FlutterPluginBinding binding) {
    this.flutterPluginBinding = binding;
  }

  @Override
  public void onDetachedFromEngine(@NonNull FlutterPluginBinding binding) {
    this.flutterPluginBinding = null;
  }

}
