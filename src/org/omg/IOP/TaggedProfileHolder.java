package org.omg.IOP;

/**
* org/omg/IOP/TaggedProfileHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-x64-cygwin/jdk8u361/3183/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Monday, January 9, 2023 8:40:21 AM UTC
*/

public final class TaggedProfileHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.IOP.TaggedProfile value = null;

  public TaggedProfileHolder ()
  {
  }

  public TaggedProfileHolder (org.omg.IOP.TaggedProfile initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.IOP.TaggedProfileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.IOP.TaggedProfileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.IOP.TaggedProfileHelper.type ();
  }

}
