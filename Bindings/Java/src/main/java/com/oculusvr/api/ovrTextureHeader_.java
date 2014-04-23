package com.oculusvr.api;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : OVR_CAPI.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ovrTextureHeader_ extends Structure {
  /**
   * @see ovrRenderAPIType<br>
   * C type : ovrRenderAPIType
   */
  public int API;
  /** C type : ovrSizei */
  public ovrSizei_ TextureSize;
  /**
   * Pixel viewport in texture that holds eye image.<br>
   * C type : ovrRecti
   */
  public ovrRecti_ RenderViewport;
  public ovrTextureHeader_() {
    super();
  }
  protected List<? > getFieldOrder() {
    return Arrays.asList("API", "TextureSize", "RenderViewport");
  }
  /**
   * @param API @see ovrRenderAPIType<br>
   * C type : ovrRenderAPIType<br>
   * @param TextureSize C type : ovrSizei<br>
   * @param RenderViewport Pixel viewport in texture that holds eye image.<br>
   * C type : ovrRecti
   */
  public ovrTextureHeader_(int API, ovrSizei_ TextureSize, ovrRecti_ RenderViewport) {
    super();
    this.API = API;
    this.TextureSize = TextureSize;
    this.RenderViewport = RenderViewport;
  }
  public static class ByReference extends ovrTextureHeader_ implements Structure.ByReference {
    
  };
  public static class ByValue extends ovrTextureHeader_ implements Structure.ByValue {
    
  };
}
