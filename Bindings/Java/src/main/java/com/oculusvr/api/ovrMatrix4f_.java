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
public class ovrMatrix4f_ extends Structure {
  /** C type : float[4][4] */
  public float[] M = new float[((4) * (4))];
  public ovrMatrix4f_() {
    super();
  }
  protected List<? > getFieldOrder() {
    return Arrays.asList("M");
  }
  /** @param M C type : float[4][4] */
  public ovrMatrix4f_(float M[]) {
    super();
    if ((M.length != this.M.length)) 
      throw new IllegalArgumentException("Wrong array size !");
    this.M = M;
  }
  public static class ByReference extends ovrMatrix4f_ implements Structure.ByReference {
    
  };
  public static class ByValue extends ovrMatrix4f_ implements Structure.ByValue {
    
  };
}
