// automatically generated by the FlatBuffers compiler, do not modify

package wiki.models.item;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class ItemReq extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static ItemReq getRootAsItemReq(ByteBuffer _bb) { return getRootAsItemReq(_bb, new ItemReq()); }
  public static ItemReq getRootAsItemReq(ByteBuffer _bb, ItemReq obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public ItemReq __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public wiki.models.item.Item item() { return item(new wiki.models.item.Item()); }
  public wiki.models.item.Item item(wiki.models.item.Item obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createItemReq(FlatBufferBuilder builder,
      int itemOffset) {
    builder.startTable(1);
    ItemReq.addItem(builder, itemOffset);
    return ItemReq.endItemReq(builder);
  }

  public static void startItemReq(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addItem(FlatBufferBuilder builder, int itemOffset) { builder.addOffset(0, itemOffset, 0); }
  public static int endItemReq(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public ItemReq get(int j) { return get(new ItemReq(), j); }
    public ItemReq get(ItemReq obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

