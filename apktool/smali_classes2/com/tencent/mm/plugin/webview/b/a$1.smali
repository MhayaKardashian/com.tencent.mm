.class final Lcom/tencent/mm/plugin/webview/b/a$1;
.super Lcom/tencent/mm/sdk/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/mm/plugin/webview/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/tencent/mm/sdk/c/c",
        "<",
        "Lcom/tencent/mm/e/a/iu;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic iBg:Lcom/tencent/mm/plugin/webview/b/a;


# direct methods
.method constructor <init>(Lcom/tencent/mm/plugin/webview/b/a;)V
    .locals 1

    .prologue
    .line 226
    iput-object p1, p0, Lcom/tencent/mm/plugin/webview/b/a$1;->iBg:Lcom/tencent/mm/plugin/webview/b/a;

    invoke-direct {p0}, Lcom/tencent/mm/sdk/c/c;-><init>()V

    const-class v0, Lcom/tencent/mm/e/a/iu;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    iput v0, p0, Lcom/tencent/mm/plugin/webview/b/a$1;->kum:I

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/tencent/mm/sdk/c/b;)Z
    .locals 5

    .prologue
    .line 226
    check-cast p1, Lcom/tencent/mm/e/a/iu;

    instance-of v0, p1, Lcom/tencent/mm/e/a/iu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/mm/plugin/webview/b/a$1;->iBg:Lcom/tencent/mm/plugin/webview/b/a;

    iget-object v0, v0, Lcom/tencent/mm/plugin/webview/b/a;->iBe:Lcom/tencent/mm/plugin/webview/b/a$a;

    iget-object v1, p1, Lcom/tencent/mm/e/a/iu;->aqB:Lcom/tencent/mm/e/a/iu$a;

    iget v1, v1, Lcom/tencent/mm/e/a/iu$a;->type:I

    iget-object v2, p1, Lcom/tencent/mm/e/a/iu;->aqB:Lcom/tencent/mm/e/a/iu$a;

    iget-object v2, v2, Lcom/tencent/mm/e/a/iu$a;->aqC:Ljava/lang/String;

    iget-object v3, p1, Lcom/tencent/mm/e/a/iu;->aqB:Lcom/tencent/mm/e/a/iu$a;

    iget-object v3, v3, Lcom/tencent/mm/e/a/iu$a;->aqD:Ljava/lang/String;

    iget-object v4, p1, Lcom/tencent/mm/e/a/iu;->aqB:Lcom/tencent/mm/e/a/iu$a;

    iget v4, v4, Lcom/tencent/mm/e/a/iu$a;->aqE:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/tencent/mm/plugin/webview/b/a$a;->c(ILjava/lang/String;Ljava/lang/String;I)V

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
