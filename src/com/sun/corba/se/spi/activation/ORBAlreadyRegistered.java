package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ORBAlreadyRegistered.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-x64-cygwin/jdk8u361/3183/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Monday, January 9, 2023 8:40:21 AM UTC
*/

public final class ORBAlreadyRegistered extends org.omg.CORBA.UserException
{
  public String orbId = null;

  public ORBAlreadyRegistered ()
  {
    super(ORBAlreadyRegisteredHelper.id());
  } // ctor

  public ORBAlreadyRegistered (String _orbId)
  {
    super(ORBAlreadyRegisteredHelper.id());
    orbId = _orbId;
  } // ctor


  public ORBAlreadyRegistered (String $reason, String _orbId)
  {
    super(ORBAlreadyRegisteredHelper.id() + "  " + $reason);
    orbId = _orbId;
  } // ctor

} // class ORBAlreadyRegistered
