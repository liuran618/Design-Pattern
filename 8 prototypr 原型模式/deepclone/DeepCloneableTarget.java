package prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable,Cloneable {
    private static final long serialVersionUID = 1L;
    private String cloneName;
    private String cloneClass;

    //构造器
    public DeepCloneableTarget(String cloneName,String cloneClass){
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //因为该类的属性都是 String，所以我们使用默认的 clone 方法即可（浅拷贝）
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
