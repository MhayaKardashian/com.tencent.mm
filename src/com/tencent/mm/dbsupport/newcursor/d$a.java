package com.tencent.mm.dbsupport.newcursor;

import android.database.CursorIndexOutOfBoundsException;

public final class d$a
{
  private Object[] bkn;
  private final int endIndex;
  private int index;
  
  public d$a(d paramd, int paramInt1, int paramInt2, Object[] paramArrayOfObject)
  {
    index = paramInt1;
    endIndex = paramInt2;
    bkn = paramArrayOfObject;
  }
  
  public final a af(Object paramObject)
  {
    if (index == endIndex) {
      throw new CursorIndexOutOfBoundsException("No more columns left.");
    }
    Object[] arrayOfObject = bkn;
    int i = index;
    index = (i + 1);
    arrayOfObject[i] = paramObject;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.dbsupport.newcursor.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */