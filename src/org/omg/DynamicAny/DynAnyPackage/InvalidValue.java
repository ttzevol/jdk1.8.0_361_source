package org.omg.DynamicAny.DynAnyPackage;


/**
* org/omg/DynamicAny/DynAnyPackage/InvalidValue.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-x64-cygwin/jdk8u361/3183/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Monday, January 9, 2023 8:40:21 AM UTC
*/

public final class InvalidValue extends org.omg.CORBA.UserException
{

  public InvalidValue ()
  {
    super(InvalidValueHelper.id());
  } // ctor


  public InvalidValue (String $reason)
  {
    super(InvalidValueHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidValue
