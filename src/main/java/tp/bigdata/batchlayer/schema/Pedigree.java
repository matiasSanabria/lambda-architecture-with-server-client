/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tp.bigdata.batchlayer.schema;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-10-16")
public class Pedigree implements org.apache.thrift.TBase<Pedigree, Pedigree._Fields>, java.io.Serializable, Cloneable, Comparable<Pedigree> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Pedigree");

  private static final org.apache.thrift.protocol.TField TRUE_AS_OF_SECS_FIELD_DESC = new org.apache.thrift.protocol.TField("trueAsOfSecs", org.apache.thrift.protocol.TType.I64, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PedigreeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PedigreeTupleSchemeFactory();

  public long trueAsOfSecs; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRUE_AS_OF_SECS((short)1, "trueAsOfSecs");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TRUE_AS_OF_SECS
          return TRUE_AS_OF_SECS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TRUEASOFSECS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TRUE_AS_OF_SECS, new org.apache.thrift.meta_data.FieldMetaData("trueAsOfSecs", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Pedigree.class, metaDataMap);
  }

  public Pedigree() {
  }

  public Pedigree(
    long trueAsOfSecs)
  {
    this();
    this.trueAsOfSecs = trueAsOfSecs;
    setTrueAsOfSecsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Pedigree(Pedigree other) {
    __isset_bitfield = other.__isset_bitfield;
    this.trueAsOfSecs = other.trueAsOfSecs;
  }

  public Pedigree deepCopy() {
    return new Pedigree(this);
  }

  public void clear() {
    setTrueAsOfSecsIsSet(false);
    this.trueAsOfSecs = 0;
  }

  public long getTrueAsOfSecs() {
    return this.trueAsOfSecs;
  }

  public Pedigree setTrueAsOfSecs(long trueAsOfSecs) {
    this.trueAsOfSecs = trueAsOfSecs;
    setTrueAsOfSecsIsSet(true);
    return this;
  }

  public void unsetTrueAsOfSecs() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TRUEASOFSECS_ISSET_ID);
  }

  /** Returns true if field trueAsOfSecs is set (has been assigned a value) and false otherwise */
  public boolean isSetTrueAsOfSecs() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TRUEASOFSECS_ISSET_ID);
  }

  public void setTrueAsOfSecsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TRUEASOFSECS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TRUE_AS_OF_SECS:
      if (value == null) {
        unsetTrueAsOfSecs();
      } else {
        setTrueAsOfSecs((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TRUE_AS_OF_SECS:
      return getTrueAsOfSecs();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TRUE_AS_OF_SECS:
      return isSetTrueAsOfSecs();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Pedigree)
      return this.equals((Pedigree)that);
    return false;
  }

  public boolean equals(Pedigree that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_trueAsOfSecs = true;
    boolean that_present_trueAsOfSecs = true;
    if (this_present_trueAsOfSecs || that_present_trueAsOfSecs) {
      if (!(this_present_trueAsOfSecs && that_present_trueAsOfSecs))
        return false;
      if (this.trueAsOfSecs != that.trueAsOfSecs)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(trueAsOfSecs);

    return hashCode;
  }

  public int compareTo(Pedigree other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTrueAsOfSecs()).compareTo(other.isSetTrueAsOfSecs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTrueAsOfSecs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.trueAsOfSecs, other.trueAsOfSecs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Pedigree(");
    boolean first = true;

    sb.append("trueAsOfSecs:");
    sb.append(this.trueAsOfSecs);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'trueAsOfSecs' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PedigreeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PedigreeStandardScheme getScheme() {
      return new PedigreeStandardScheme();
    }
  }

  private static class PedigreeStandardScheme extends org.apache.thrift.scheme.StandardScheme<Pedigree> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Pedigree struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TRUE_AS_OF_SECS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.trueAsOfSecs = iprot.readI64();
              struct.setTrueAsOfSecsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetTrueAsOfSecs()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'trueAsOfSecs' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Pedigree struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TRUE_AS_OF_SECS_FIELD_DESC);
      oprot.writeI64(struct.trueAsOfSecs);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PedigreeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PedigreeTupleScheme getScheme() {
      return new PedigreeTupleScheme();
    }
  }

  private static class PedigreeTupleScheme extends org.apache.thrift.scheme.TupleScheme<Pedigree> {

    public void write(org.apache.thrift.protocol.TProtocol prot, Pedigree struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.trueAsOfSecs);
    }

    public void read(org.apache.thrift.protocol.TProtocol prot, Pedigree struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.trueAsOfSecs = iprot.readI64();
      struct.setTrueAsOfSecsIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

