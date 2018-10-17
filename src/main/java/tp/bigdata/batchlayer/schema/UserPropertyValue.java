/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package tp.bigdata.batchlayer.schema;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class UserPropertyValue extends org.apache.thrift.TUnion<UserPropertyValue, UserPropertyValue._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserPropertyValue");
  private static final org.apache.thrift.protocol.TField USERNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("username", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PHONE_FIELD_DESC = new org.apache.thrift.protocol.TField("phone", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField BIRTHDAY_FIELD_DESC = new org.apache.thrift.protocol.TField("birthday", org.apache.thrift.protocol.TType.STRING, (short)5);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USERNAME((short)1, "username"),
    NAME((short)2, "name"),
    EMAIL((short)3, "email"),
    PHONE((short)4, "phone"),
    BIRTHDAY((short)5, "birthday");

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
        case 1: // USERNAME
          return USERNAME;
        case 2: // NAME
          return NAME;
        case 3: // EMAIL
          return EMAIL;
        case 4: // PHONE
          return PHONE;
        case 5: // BIRTHDAY
          return BIRTHDAY;
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

  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USERNAME, new org.apache.thrift.meta_data.FieldMetaData("username", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EMAIL, new org.apache.thrift.meta_data.FieldMetaData("email", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PHONE, new org.apache.thrift.meta_data.FieldMetaData("phone", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BIRTHDAY, new org.apache.thrift.meta_data.FieldMetaData("birthday", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserPropertyValue.class, metaDataMap);
  }

  public UserPropertyValue() {
    super();
  }

  public UserPropertyValue(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public UserPropertyValue(UserPropertyValue other) {
    super(other);
  }
  public UserPropertyValue deepCopy() {
    return new UserPropertyValue(this);
  }

  public static UserPropertyValue username(java.lang.String value) {
    UserPropertyValue x = new UserPropertyValue();
    x.setUsername(value);
    return x;
  }

  public static UserPropertyValue name(java.lang.String value) {
    UserPropertyValue x = new UserPropertyValue();
    x.setName(value);
    return x;
  }

  public static UserPropertyValue email(java.lang.String value) {
    UserPropertyValue x = new UserPropertyValue();
    x.setEmail(value);
    return x;
  }

  public static UserPropertyValue phone(java.lang.String value) {
    UserPropertyValue x = new UserPropertyValue();
    x.setPhone(value);
    return x;
  }

  public static UserPropertyValue birthday(java.lang.String value) {
    UserPropertyValue x = new UserPropertyValue();
    x.setBirthday(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case USERNAME:
        if (value instanceof java.lang.String) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.String for field 'username', but got " + value.getClass().getSimpleName());
      case NAME:
        if (value instanceof java.lang.String) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.String for field 'name', but got " + value.getClass().getSimpleName());
      case EMAIL:
        if (value instanceof java.lang.String) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.String for field 'email', but got " + value.getClass().getSimpleName());
      case PHONE:
        if (value instanceof java.lang.String) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.String for field 'phone', but got " + value.getClass().getSimpleName());
      case BIRTHDAY:
        if (value instanceof java.lang.String) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.lang.String for field 'birthday', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case USERNAME:
          if (field.type == USERNAME_FIELD_DESC.type) {
            java.lang.String username;
            username = iprot.readString();
            return username;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case NAME:
          if (field.type == NAME_FIELD_DESC.type) {
            java.lang.String name;
            name = iprot.readString();
            return name;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case EMAIL:
          if (field.type == EMAIL_FIELD_DESC.type) {
            java.lang.String email;
            email = iprot.readString();
            return email;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case PHONE:
          if (field.type == PHONE_FIELD_DESC.type) {
            java.lang.String phone;
            phone = iprot.readString();
            return phone;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case BIRTHDAY:
          if (field.type == BIRTHDAY_FIELD_DESC.type) {
            java.lang.String birthday;
            birthday = iprot.readString();
            return birthday;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case USERNAME:
        java.lang.String username = (java.lang.String)value_;
        oprot.writeString(username);
        return;
      case NAME:
        java.lang.String name = (java.lang.String)value_;
        oprot.writeString(name);
        return;
      case EMAIL:
        java.lang.String email = (java.lang.String)value_;
        oprot.writeString(email);
        return;
      case PHONE:
        java.lang.String phone = (java.lang.String)value_;
        oprot.writeString(phone);
        return;
      case BIRTHDAY:
        java.lang.String birthday = (java.lang.String)value_;
        oprot.writeString(birthday);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected java.lang.Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case USERNAME:
          java.lang.String username;
          username = iprot.readString();
          return username;
        case NAME:
          java.lang.String name;
          name = iprot.readString();
          return name;
        case EMAIL:
          java.lang.String email;
          email = iprot.readString();
          return email;
        case PHONE:
          java.lang.String phone;
          phone = iprot.readString();
          return phone;
        case BIRTHDAY:
          java.lang.String birthday;
          birthday = iprot.readString();
          return birthday;
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new org.apache.thrift.protocol.TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case USERNAME:
        java.lang.String username = (java.lang.String)value_;
        oprot.writeString(username);
        return;
      case NAME:
        java.lang.String name = (java.lang.String)value_;
        oprot.writeString(name);
        return;
      case EMAIL:
        java.lang.String email = (java.lang.String)value_;
        oprot.writeString(email);
        return;
      case PHONE:
        java.lang.String phone = (java.lang.String)value_;
        oprot.writeString(phone);
        return;
      case BIRTHDAY:
        java.lang.String birthday = (java.lang.String)value_;
        oprot.writeString(birthday);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case USERNAME:
        return USERNAME_FIELD_DESC;
      case NAME:
        return NAME_FIELD_DESC;
      case EMAIL:
        return EMAIL_FIELD_DESC;
      case PHONE:
        return PHONE_FIELD_DESC;
      case BIRTHDAY:
        return BIRTHDAY_FIELD_DESC;
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public java.lang.String getUsername() {
    if (getSetField() == _Fields.USERNAME) {
      return (java.lang.String)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'username' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setUsername(java.lang.String value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.USERNAME;
    value_ = value;
  }

  public java.lang.String getName() {
    if (getSetField() == _Fields.NAME) {
      return (java.lang.String)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'name' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setName(java.lang.String value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.NAME;
    value_ = value;
  }

  public java.lang.String getEmail() {
    if (getSetField() == _Fields.EMAIL) {
      return (java.lang.String)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'email' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setEmail(java.lang.String value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.EMAIL;
    value_ = value;
  }

  public java.lang.String getPhone() {
    if (getSetField() == _Fields.PHONE) {
      return (java.lang.String)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'phone' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setPhone(java.lang.String value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.PHONE;
    value_ = value;
  }

  public java.lang.String getBirthday() {
    if (getSetField() == _Fields.BIRTHDAY) {
      return (java.lang.String)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'birthday' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setBirthday(java.lang.String value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.BIRTHDAY;
    value_ = value;
  }

  public boolean isSetUsername() {
    return setField_ == _Fields.USERNAME;
  }


  public boolean isSetName() {
    return setField_ == _Fields.NAME;
  }


  public boolean isSetEmail() {
    return setField_ == _Fields.EMAIL;
  }


  public boolean isSetPhone() {
    return setField_ == _Fields.PHONE;
  }


  public boolean isSetBirthday() {
    return setField_ == _Fields.BIRTHDAY;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof UserPropertyValue) {
      return equals((UserPropertyValue)other);
    } else {
      return false;
    }
  }

  public boolean equals(UserPropertyValue other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  public int compareTo(UserPropertyValue other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      java.lang.Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}