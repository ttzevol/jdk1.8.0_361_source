package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ORBPortInfoListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-x64-cygwin/jdk8u361/3183/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Monday, January 9, 2023 8:40:21 AM UTC
*/

public final class ORBPortInfoListHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.spi.activation.ORBPortInfo value[] = null;

  public ORBPortInfoListHolder ()
  {
  }

  public ORBPortInfoListHolder (com.sun.corba.se.spi.activation.ORBPortInfo[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.ORBPortInfoListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.ORBPortInfoListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.ORBPortInfoListHelper.type ();
  }

}
