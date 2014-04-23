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
public class ovrDistortionVertex_ extends Structure {
  /** C type : ovrVector2f */
  public ovrVector2f_ Pos;
  /** Lerp factor between time-warp matrices. Can be encoded in Pos.z. */
  public float TimeWarpFactor;
  /** Vignette fade factor. Can be encoded in Pos.w. */
  public float VignetteFactor;
  /** C type : ovrVector2f */
  public ovrVector2f_ TexR;
  /** C type : ovrVector2f */
  public ovrVector2f_ TexG;
  /** C type : ovrVector2f */
  public ovrVector2f_ TexB;
  public ovrDistortionVertex_() {
    super();
  }
  protected List<? > getFieldOrder() {
    return Arrays.asList("Pos", "TimeWarpFactor", "VignetteFactor", "TexR", "TexG", "TexB");
  }
  /**
   * @param Pos C type : ovrVector2f<br>
   * @param TimeWarpFactor Lerp factor between time-warp matrices. Can be encoded in Pos.z.<br>
   * @param VignetteFactor Vignette fade factor. Can be encoded in Pos.w.<br>
   * @param TexR C type : ovrVector2f<br>
   * @param TexG C type : ovrVector2f<br>
   * @param TexB C type : ovrVector2f
   */
  public ovrDistortionVertex_(ovrVector2f_ Pos, float TimeWarpFactor, float VignetteFactor, ovrVector2f_ TexR, ovrVector2f_ TexG, ovrVector2f_ TexB) {
    super();
    this.Pos = Pos;
    this.TimeWarpFactor = TimeWarpFactor;
    this.VignetteFactor = VignetteFactor;
    this.TexR = TexR;
    this.TexG = TexG;
    this.TexB = TexB;
  }
  public static class ByReference extends ovrDistortionVertex_ implements Structure.ByReference {
    
  };
  public static class ByValue extends ovrDistortionVertex_ implements Structure.ByValue {
    
  };
}
