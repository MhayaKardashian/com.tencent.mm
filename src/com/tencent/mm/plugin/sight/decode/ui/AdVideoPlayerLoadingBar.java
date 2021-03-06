package com.tencent.mm.plugin.sight.decode.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.v;

public class AdVideoPlayerLoadingBar
  extends RelativeLayout
  implements a
{
  private int bQx = 0;
  private View cJf = null;
  private boolean con = false;
  private ImageView gEA = null;
  private ImageView gEB = null;
  private ImageView gEC = null;
  private TextView gED;
  private TextView gEE;
  private int gEF = 0;
  private int gEG = 0;
  private float gEH = 0.0F;
  private int gEI = -1;
  private int gEJ = -1;
  private int gEK = -1;
  private int gEL = -1;
  private b gEy = null;
  private ImageView gEz;
  
  public AdVideoPlayerLoadingBar(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public AdVideoPlayerLoadingBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public AdVideoPlayerLoadingBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private int ayp()
  {
    gEG = gEA.getWidth();
    return gEG;
  }
  
  private void init()
  {
    cJf = View.inflate(getContext(), 2130904551, this);
    gEz = ((ImageView)cJf.findViewById(2131759063));
    gEA = ((ImageView)cJf.findViewById(2131759062));
    gEB = ((ImageView)cJf.findViewById(2131759064));
    gEC = ((ImageView)cJf.findViewById(2131759059));
    gED = ((TextView)cJf.findViewById(2131759060));
    gEE = ((TextView)cJf.findViewById(2131759061));
    gEB.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        if (paramAnonymousMotionEvent.getAction() == 0)
        {
          v.i("MicroMsg.VideoPlayerLoadingBar", "ontouch down");
          AdVideoPlayerLoadingBar.a(AdVideoPlayerLoadingBar.this, false);
          AdVideoPlayerLoadingBar.a(AdVideoPlayerLoadingBar.this, paramAnonymousMotionEvent.getX());
          if (AdVideoPlayerLoadingBar.a(AdVideoPlayerLoadingBar.this) != null) {
            AdVideoPlayerLoadingBar.a(AdVideoPlayerLoadingBar.this).ays();
          }
        }
        do
        {
          return true;
          if (paramAnonymousMotionEvent.getAction() == 2)
          {
            float f = paramAnonymousMotionEvent.getX();
            paramAnonymousView = (FrameLayout.LayoutParams)AdVideoPlayerLoadingBar.b(AdVideoPlayerLoadingBar.this).getLayoutParams();
            i = leftMargin;
            int j = (int)(f - AdVideoPlayerLoadingBar.c(AdVideoPlayerLoadingBar.this));
            leftMargin = AdVideoPlayerLoadingBar.a(AdVideoPlayerLoadingBar.this, j + i);
            AdVideoPlayerLoadingBar.b(AdVideoPlayerLoadingBar.this).setLayoutParams(paramAnonymousView);
            i = AdVideoPlayerLoadingBar.d(AdVideoPlayerLoadingBar.this);
            if (AdVideoPlayerLoadingBar.e(AdVideoPlayerLoadingBar.this) > 0)
            {
              paramAnonymousView = (FrameLayout.LayoutParams)AdVideoPlayerLoadingBar.f(AdVideoPlayerLoadingBar.this).getLayoutParams();
              width = ((int)(i * 1.0D / AdVideoPlayerLoadingBar.e(AdVideoPlayerLoadingBar.this) * AdVideoPlayerLoadingBar.g(AdVideoPlayerLoadingBar.this)));
              AdVideoPlayerLoadingBar.f(AdVideoPlayerLoadingBar.this).setLayoutParams(paramAnonymousView);
            }
            AdVideoPlayerLoadingBar.h(AdVideoPlayerLoadingBar.this).setText(AdVideoPlayerLoadingBar.mc(i / 60) + ":" + AdVideoPlayerLoadingBar.mc(i % 60));
            AdVideoPlayerLoadingBar.a(AdVideoPlayerLoadingBar.this, true);
            return true;
          }
        } while (!AdVideoPlayerLoadingBar.i(AdVideoPlayerLoadingBar.this));
        int i = AdVideoPlayerLoadingBar.d(AdVideoPlayerLoadingBar.this);
        if (AdVideoPlayerLoadingBar.a(AdVideoPlayerLoadingBar.this) != null)
        {
          v.i("MicroMsg.VideoPlayerLoadingBar", "current time : " + i);
          AdVideoPlayerLoadingBar.a(AdVideoPlayerLoadingBar.this).md(i);
        }
        AdVideoPlayerLoadingBar.a(AdVideoPlayerLoadingBar.this, false);
        return true;
      }
    });
  }
  
  public static String mc(int paramInt)
  {
    if (paramInt < 10) {
      return "0" + paramInt;
    }
    return String.valueOf(paramInt);
  }
  
  public final void a(b paramb)
  {
    gEy = paramb;
  }
  
  public final int ayo()
  {
    return gEF;
  }
  
  public final void ayq()
  {
    gEG = 0;
  }
  
  public final void ayr()
  {
    if (gEF == 0) {}
    while ((con) || (gEB == null) || (ayp() == 0)) {
      return;
    }
    int i = (gEB.getWidth() - gEB.getPaddingLeft() - gEB.getPaddingRight()) / 2;
    gED.setText(mc(bQx / 60) + ":" + mc(bQx % 60));
    int j = gEA.getLayoutParams()).leftMargin;
    int k = gEB.getPaddingLeft();
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)gEB.getLayoutParams();
    leftMargin = (j - k + (int)(bQx * 1.0D / gEF * ayp()) - i);
    gEB.setLayoutParams(localLayoutParams);
    localLayoutParams = (FrameLayout.LayoutParams)gEz.getLayoutParams();
    width = ((int)(bQx * 1.0D / gEF * ayp()));
    gEz.setLayoutParams(localLayoutParams);
  }
  
  public final void c(View.OnClickListener paramOnClickListener)
  {
    gEC.setOnClickListener(paramOnClickListener);
  }
  
  public final void eu(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      gEC.setImageResource(2131165570);
      return;
    }
    gEC.setImageResource(2131165572);
  }
  
  public final void ma(int paramInt)
  {
    bQx = paramInt;
    ayr();
  }
  
  public final void mb(final int paramInt)
  {
    if (gEB.getWidth() == 0)
    {
      post(new Runnable()
      {
        public final void run()
        {
          mb(paramInt);
        }
      });
      return;
    }
    gEF = paramInt;
    bQx = 0;
    gEE.setText(mc(gEF / 60) + ":" + mc(gEF % 60));
    ayr();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != gEI) || (paramInt2 != gEJ) || (paramInt3 != gEK) || (paramInt4 != gEL)) {
      ayr();
    }
    gEI = paramInt1;
    gEJ = paramInt2;
    gEK = paramInt3;
    gEL = paramInt4;
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */