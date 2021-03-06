/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'NeighborTblMsg'
 * message type.
 */
package serialcomm;

public class NeighborTblMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 84;//62;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 160;

    /** Create a new NeighborTblMsg of size 62. */
    public NeighborTblMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new NeighborTblMsg of the given data_length. */
    public NeighborTblMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new NeighborTblMsg with the given data_length
     * and base offset.
     */
    public NeighborTblMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new NeighborTblMsg using the given byte array
     * as backing store.
     */
    public NeighborTblMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new NeighborTblMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public NeighborTblMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new NeighborTblMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public NeighborTblMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new NeighborTblMsg embedded in the given message
     * at the given base offset.
     */
    public NeighborTblMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new NeighborTblMsg embedded in the given message
     * at the given base offset and length.
     */
    public NeighborTblMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <NeighborTblMsg> \n";
      try {
        s += "  [senderID=0x"+Long.toHexString(get_senderID())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [nbrNum=0x"+Long.toHexString(get_nbrNum())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [nbrTbl.nbrID=";
        for (int i = 0; i < 20; i++) {
          s += "0x"+Long.toHexString(getElement_nbrTbl_nbrID(i) & 0xffff)+" ";
        }
        s += "]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [nbrTbl.beaconsReceived=";
        for (int i = 0; i < 20; i++) {
          s += "0x"+Long.toHexString(getElement_nbrTbl_beaconsReceived(i) & 0xff)+" ";
        }
        s += "]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: senderID
    //   Field type: short
    //   Offset (bits): 0
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'senderID' is signed (false).
     */
    public static boolean isSigned_senderID() {
        return false;
    }

    /**
     * Return whether the field 'senderID' is an array (false).
     */
    public static boolean isArray_senderID() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'senderID'
     */
    public static int offset_senderID() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'senderID'
     */
    public static int offsetBits_senderID() {
        return 0;
    }

    /**
     * Return the value (as a short) of the field 'senderID'
     */
    public short get_senderID() {
        return (short)getUIntBEElement(offsetBits_senderID(), 8);
    }

    /**
     * Set the value of the field 'senderID'
     */
    public void set_senderID(short value) {
        setUIntBEElement(offsetBits_senderID(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'senderID'
     */
    public static int size_senderID() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'senderID'
     */
    public static int sizeBits_senderID() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nbrNum
    //   Field type: short
    //   Offset (bits): 8
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nbrNum' is signed (false).
     */
    public static boolean isSigned_nbrNum() {
        return false;
    }

    /**
     * Return whether the field 'nbrNum' is an array (false).
     */
    public static boolean isArray_nbrNum() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nbrNum'
     */
    public static int offset_nbrNum() {
        return (8 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nbrNum'
     */
    public static int offsetBits_nbrNum() {
        return 8;
    }

    /**
     * Return the value (as a short) of the field 'nbrNum'
     */
    public short get_nbrNum() {
        return (short)getUIntBEElement(offsetBits_nbrNum(), 8);
    }

    /**
     * Set the value of the field 'nbrNum'
     */
    public void set_nbrNum(short value) {
        setUIntBEElement(offsetBits_nbrNum(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'nbrNum'
     */
    public static int size_nbrNum() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'nbrNum'
     */
    public static int sizeBits_nbrNum() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nbrTbl.nbrID
    //   Field type: short[]
    //   Offset (bits): 0
    //   Size of each element (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nbrTbl.nbrID' is signed (false).
     */
    public static boolean isSigned_nbrTbl_nbrID() {
        return false;
    }

    /**
     * Return whether the field 'nbrTbl.nbrID' is an array (true).
     */
    public static boolean isArray_nbrTbl_nbrID() {
        return true;
    }

    /**
     * Return the offset (in bytes) of the field 'nbrTbl.nbrID'
     */
    public static int offset_nbrTbl_nbrID(int index1) {
        int offset = 0;
        if (index1 < 0 || index1 >= 20) throw new ArrayIndexOutOfBoundsException();
        offset += 16 + index1 * 24;
        return (offset / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nbrTbl.nbrID'
     */
    public static int offsetBits_nbrTbl_nbrID(int index1) {
        int offset = 0;
        if (index1 < 0 || index1 >= 20) throw new ArrayIndexOutOfBoundsException();
        offset += 16 + index1 * 24;
        return offset;
    }

    /**
     * Return the entire array 'nbrTbl.nbrID' as a short[]
     */
    public short[] get_nbrTbl_nbrID() {
        short[] tmp = new short[20];
        for (int index0 = 0; index0 < numElements_nbrTbl_nbrID(0); index0++) {
            tmp[index0] = getElement_nbrTbl_nbrID(index0);
        }
        return tmp;
    }

    /**
     * Set the contents of the array 'nbrTbl.nbrID' from the given short[]
     */
    public void set_nbrTbl_nbrID(short[] value) {
        for (int index0 = 0; index0 < value.length; index0++) {
            setElement_nbrTbl_nbrID(index0, value[index0]);
        }
    }

    /**
     * Return an element (as a short) of the array 'nbrTbl.nbrID'
     */
    public short getElement_nbrTbl_nbrID(int index1) {
        return (short)getSIntBEElement(offsetBits_nbrTbl_nbrID(index1), 16);
    }

    /**
     * Set an element of the array 'nbrTbl.nbrID'
     */
    public void setElement_nbrTbl_nbrID(int index1, short value) {
        setSIntBEElement(offsetBits_nbrTbl_nbrID(index1), 16, value);
    }

    /**
     * Return the total size, in bytes, of the array 'nbrTbl.nbrID'
     */
    public static int totalSize_nbrTbl_nbrID() {
        return (480 / 8);
    }

    /**
     * Return the total size, in bits, of the array 'nbrTbl.nbrID'
     */
    public static int totalSizeBits_nbrTbl_nbrID() {
        return 480;
    }

    /**
     * Return the size, in bytes, of each element of the array 'nbrTbl.nbrID'
     */
    public static int elementSize_nbrTbl_nbrID() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of each element of the array 'nbrTbl.nbrID'
     */
    public static int elementSizeBits_nbrTbl_nbrID() {
        return 16;
    }

    /**
     * Return the number of dimensions in the array 'nbrTbl.nbrID'
     */
    public static int numDimensions_nbrTbl_nbrID() {
        return 1;
    }

    /**
     * Return the number of elements in the array 'nbrTbl.nbrID'
     */
    public static int numElements_nbrTbl_nbrID() {
        return 20;
    }

    /**
     * Return the number of elements in the array 'nbrTbl.nbrID'
     * for the given dimension.
     */
    public static int numElements_nbrTbl_nbrID(int dimension) {
      int array_dims[] = { 20,  };
        if (dimension < 0 || dimension >= 1) throw new ArrayIndexOutOfBoundsException();
        if (array_dims[dimension] == 0) throw new IllegalArgumentException("Array dimension "+dimension+" has unknown size");
        return array_dims[dimension];
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nbrTbl.beaconsReceived
    //   Field type: short[]
    //   Offset (bits): 16
    //   Size of each element (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nbrTbl.beaconsReceived' is signed (false).
     */
    public static boolean isSigned_nbrTbl_beaconsReceived() {
        return false;
    }

    /**
     * Return whether the field 'nbrTbl.beaconsReceived' is an array (true).
     */
    public static boolean isArray_nbrTbl_beaconsReceived() {
        return true;
    }

    /**
     * Return the offset (in bytes) of the field 'nbrTbl.beaconsReceived'
     */
    public static int offset_nbrTbl_beaconsReceived(int index1) {
        int offset = 16;
        if (index1 < 0 || index1 >= 20) throw new ArrayIndexOutOfBoundsException();
        offset += 16 + index1 * 24;
        return (offset / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nbrTbl.beaconsReceived'
     */
    public static int offsetBits_nbrTbl_beaconsReceived(int index1) {
        int offset = 16;
        if (index1 < 0 || index1 >= 20) throw new ArrayIndexOutOfBoundsException();
        offset += 16 + index1 * 24;
        return offset;
    }

    /**
     * Return the entire array 'nbrTbl.beaconsReceived' as a short[]
     */
    public short[] get_nbrTbl_beaconsReceived() {
        short[] tmp = new short[20];
        for (int index0 = 0; index0 < numElements_nbrTbl_beaconsReceived(0); index0++) {
            tmp[index0] = getElement_nbrTbl_beaconsReceived(index0);
        }
        return tmp;
    }

    /**
     * Set the contents of the array 'nbrTbl.beaconsReceived' from the given short[]
     */
    public void set_nbrTbl_beaconsReceived(short[] value) {
        for (int index0 = 0; index0 < value.length; index0++) {
            setElement_nbrTbl_beaconsReceived(index0, value[index0]);
        }
    }

    /**
     * Return an element (as a short) of the array 'nbrTbl.beaconsReceived'
     */
    public short getElement_nbrTbl_beaconsReceived(int index1) {
        return (short)getUIntBEElement(offsetBits_nbrTbl_beaconsReceived(index1), 8);
    }

    /**
     * Set an element of the array 'nbrTbl.beaconsReceived'
     */
    public void setElement_nbrTbl_beaconsReceived(int index1, short value) {
        setUIntBEElement(offsetBits_nbrTbl_beaconsReceived(index1), 8, value);
    }

    /**
     * Return the total size, in bytes, of the array 'nbrTbl.beaconsReceived'
     */
    public static int totalSize_nbrTbl_beaconsReceived() {
        return (480 / 8);
    }

    /**
     * Return the total size, in bits, of the array 'nbrTbl.beaconsReceived'
     */
    public static int totalSizeBits_nbrTbl_beaconsReceived() {
        return 480;
    }

    /**
     * Return the size, in bytes, of each element of the array 'nbrTbl.beaconsReceived'
     */
    public static int elementSize_nbrTbl_beaconsReceived() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of each element of the array 'nbrTbl.beaconsReceived'
     */
    public static int elementSizeBits_nbrTbl_beaconsReceived() {
        return 8;
    }

    /**
     * Return the number of dimensions in the array 'nbrTbl.beaconsReceived'
     */
    public static int numDimensions_nbrTbl_beaconsReceived() {
        return 1;
    }

    /**
     * Return the number of elements in the array 'nbrTbl.beaconsReceived'
     */
    public static int numElements_nbrTbl_beaconsReceived() {
        return 20;
    }

    /**
     * Return the number of elements in the array 'nbrTbl.beaconsReceived'
     * for the given dimension.
     */
    public static int numElements_nbrTbl_beaconsReceived(int dimension) {
      int array_dims[] = { 20,  };
        if (dimension < 0 || dimension >= 1) throw new ArrayIndexOutOfBoundsException();
        if (array_dims[dimension] == 0) throw new IllegalArgumentException("Array dimension "+dimension+" has unknown size");
        return array_dims[dimension];
    }

    /**
     * Fill in the array 'nbrTbl.beaconsReceived' with a String
     */
    public void setString_nbrTbl_beaconsReceived(String s) { 
         int len = s.length();
         int i;
         for (i = 0; i < len; i++) {
             setElement_nbrTbl_beaconsReceived(i, (short)s.charAt(i));
         }
         setElement_nbrTbl_beaconsReceived(i, (short)0); //null terminate
    }

    /**
     * Read the array 'nbrTbl.beaconsReceived' as a String
     */
    public String getString_nbrTbl_beaconsReceived() { 
         char carr[] = new char[Math.min(net.tinyos.message.Message.MAX_CONVERTED_STRING_LENGTH,20)];
         int i;
         for (i = 0; i < carr.length; i++) {
             if ((char)getElement_nbrTbl_beaconsReceived(i) == (char)0) break;
             carr[i] = (char)getElement_nbrTbl_beaconsReceived(i);
         }
         return new String(carr,0,i);
    }

}
