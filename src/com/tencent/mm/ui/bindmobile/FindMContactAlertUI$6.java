package com.tencent.mm.ui.bindmobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.ui.MMWizardActivity;

final class FindMContactAlertUI$6
  implements DialogInterface.OnClickListener
{
  FindMContactAlertUI$6(FindMContactAlertUI paramFindMContactAlertUI) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new Intent(lol, FindMContactLearmMoreUI.class);
    paramDialogInterface.putExtra("regsetinfo_ticket", FindMContactAlertUI.a(lol));
    paramDialogInterface.putExtra("regsetinfo_NextStep", FindMContactAlertUI.b(lol));
    paramDialogInterface.putExtra("regsetinfo_NextStyle", FindMContactAlertUI.c(lol));
    MMWizardActivity.v(lol, paramDialogInterface);
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.ui.bindmobile.FindMContactAlertUI.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */