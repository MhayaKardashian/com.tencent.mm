package com.tencent.mm.protocal.b;

import a.a.a.b;
import java.util.LinkedList;

public final class axm
  extends ali
{
  public String eiB;
  public int iYG;
  public int iYJ;
  public String jNI;
  public int jNJ;
  public int jNK;
  public int jPs;
  public int jPt;
  public LinkedList jPu = new LinkedList();
  public LinkedList jPv = new LinkedList();
  public int jal;
  public alx jaq;
  public int jar;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (a.a.a.c.a)paramVarArgs[0];
      if (jaq == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (jGS != null)
      {
        paramVarArgs.cj(1, jGS.kn());
        jGS.a(paramVarArgs);
      }
      if (eiB != null) {
        paramVarArgs.d(2, eiB);
      }
      if (jaq != null)
      {
        paramVarArgs.cj(3, jaq.kn());
        jaq.a(paramVarArgs);
      }
      paramVarArgs.ci(4, jal);
      if (jNI != null) {
        paramVarArgs.d(5, jNI);
      }
      paramVarArgs.ci(6, jar);
      paramVarArgs.ci(7, jNJ);
      paramVarArgs.ci(8, iYJ);
      paramVarArgs.ci(9, jNK);
      paramVarArgs.ci(10, iYG);
      paramVarArgs.ci(11, jPs);
      paramVarArgs.ci(12, jPt);
      paramVarArgs.d(13, 8, jPu);
      paramVarArgs.d(14, 8, jPv);
      return 0;
    }
    if (paramInt == 1) {
      if (jGS == null) {
        break label1142;
      }
    }
    label1142:
    for (int i = a.a.a.a.ch(1, jGS.kn()) + 0;; i = 0)
    {
      paramInt = i;
      if (eiB != null) {
        paramInt = i + a.a.a.b.b.a.e(2, eiB);
      }
      i = paramInt;
      if (jaq != null) {
        i = paramInt + a.a.a.a.ch(3, jaq.kn());
      }
      i += a.a.a.a.cg(4, jal);
      paramInt = i;
      if (jNI != null) {
        paramInt = i + a.a.a.b.b.a.e(5, jNI);
      }
      return paramInt + a.a.a.a.cg(6, jar) + a.a.a.a.cg(7, jNJ) + a.a.a.a.cg(8, iYJ) + a.a.a.a.cg(9, jNK) + a.a.a.a.cg(10, iYG) + a.a.a.a.cg(11, jPs) + a.a.a.a.cg(12, jPt) + a.a.a.a.c(13, 8, jPu) + a.a.a.a.c(14, 8, jPv);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        jPu.clear();
        jPv.clear();
        paramVarArgs = new a.a.a.a.a(paramVarArgs, iTR);
        for (paramInt = ali.a(paramVarArgs); paramInt > 0; paramInt = ali.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.bog();
          }
        }
        if (jaq != null) {
          break;
        }
        throw new b("Not all required fields were included: Data");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (a.a.a.a.a)paramVarArgs[0];
        axm localaxm = (axm)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((a.a.a.a.a)localObject1).sJ(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new dc();
            localObject2 = new a.a.a.a.a((byte[])localObject2, iTR);
            for (bool = true; bool; bool = ((dc)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.at.a)localObject1, ali.a((a.a.a.a.a)localObject2))) {}
            jGS = ((dc)localObject1);
            paramInt += 1;
          }
        case 2: 
          eiB = maU.readString();
          return 0;
        case 3: 
          paramVarArgs = ((a.a.a.a.a)localObject1).sJ(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new alx();
            localObject2 = new a.a.a.a.a((byte[])localObject2, iTR);
            for (bool = true; bool; bool = ((alx)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.at.a)localObject1, ali.a((a.a.a.a.a)localObject2))) {}
            jaq = ((alx)localObject1);
            paramInt += 1;
          }
        case 4: 
          jal = maU.jC();
          return 0;
        case 5: 
          jNI = maU.readString();
          return 0;
        case 6: 
          jar = maU.jC();
          return 0;
        case 7: 
          jNJ = maU.jC();
          return 0;
        case 8: 
          iYJ = maU.jC();
          return 0;
        case 9: 
          jNK = maU.jC();
          return 0;
        case 10: 
          iYG = maU.jC();
          return 0;
        case 11: 
          jPs = maU.jC();
          return 0;
        case 12: 
          jPt = maU.jC();
          return 0;
        case 13: 
          paramVarArgs = ((a.a.a.a.a)localObject1).sJ(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aly();
            localObject2 = new a.a.a.a.a((byte[])localObject2, iTR);
            for (bool = true; bool; bool = ((aly)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.at.a)localObject1, ali.a((a.a.a.a.a)localObject2))) {}
            jPu.add(localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((a.a.a.a.a)localObject1).sJ(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new alx();
          localObject2 = new a.a.a.a.a((byte[])localObject2, iTR);
          for (bool = true; bool; bool = ((alx)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.at.a)localObject1, ali.a((a.a.a.a.a)localObject2))) {}
          jPv.add(localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.protocal.b.axm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */