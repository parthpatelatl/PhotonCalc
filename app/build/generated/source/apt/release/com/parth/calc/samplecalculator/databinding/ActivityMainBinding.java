package com.parth.calc.android.databinding;
import com.parth.calc.android.R;
import com.parth.calc.android.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.infoTextView, 1);
        sViewsWithIds.put(R.id.editText, 2);
        sViewsWithIds.put(R.id.buttonSeven, 3);
        sViewsWithIds.put(R.id.buttonEight, 4);
        sViewsWithIds.put(R.id.buttonNine, 5);
        sViewsWithIds.put(R.id.buttonFour, 6);
        sViewsWithIds.put(R.id.buttonFive, 7);
        sViewsWithIds.put(R.id.buttonSix, 8);
        sViewsWithIds.put(R.id.buttonOne, 9);
        sViewsWithIds.put(R.id.buttonTwo, 10);
        sViewsWithIds.put(R.id.buttonThree, 11);
        sViewsWithIds.put(R.id.buttonDot, 12);
        sViewsWithIds.put(R.id.buttonZero, 13);
        sViewsWithIds.put(R.id.buttonEqual, 14);
        sViewsWithIds.put(R.id.buttonDivide, 15);
        sViewsWithIds.put(R.id.buttonMultiply, 16);
        sViewsWithIds.put(R.id.buttonSubtract, 17);
        sViewsWithIds.put(R.id.buttonAdd, 18);
        sViewsWithIds.put(R.id.buttonClear, 19);
    }
    // views
    @NonNull
    public final android.widget.RelativeLayout activityMain;
    @NonNull
    public final android.widget.Button buttonAdd;
    @NonNull
    public final android.widget.Button buttonClear;
    @NonNull
    public final android.widget.Button buttonDivide;
    @NonNull
    public final android.widget.Button buttonDot;
    @NonNull
    public final android.widget.Button buttonEight;
    @NonNull
    public final android.widget.Button buttonEqual;
    @NonNull
    public final android.widget.Button buttonFive;
    @NonNull
    public final android.widget.Button buttonFour;
    @NonNull
    public final android.widget.Button buttonMultiply;
    @NonNull
    public final android.widget.Button buttonNine;
    @NonNull
    public final android.widget.Button buttonOne;
    @NonNull
    public final android.widget.Button buttonSeven;
    @NonNull
    public final android.widget.Button buttonSix;
    @NonNull
    public final android.widget.Button buttonSubtract;
    @NonNull
    public final android.widget.Button buttonThree;
    @NonNull
    public final android.widget.Button buttonTwo;
    @NonNull
    public final android.widget.Button buttonZero;
    @NonNull
    public final android.widget.EditText editText;
    @NonNull
    public final android.widget.TextView infoTextView;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds);
        this.activityMain = (android.widget.RelativeLayout) bindings[0];
        this.activityMain.setTag(null);
        this.buttonAdd = (android.widget.Button) bindings[18];
        this.buttonClear = (android.widget.Button) bindings[19];
        this.buttonDivide = (android.widget.Button) bindings[15];
        this.buttonDot = (android.widget.Button) bindings[12];
        this.buttonEight = (android.widget.Button) bindings[4];
        this.buttonEqual = (android.widget.Button) bindings[14];
        this.buttonFive = (android.widget.Button) bindings[7];
        this.buttonFour = (android.widget.Button) bindings[6];
        this.buttonMultiply = (android.widget.Button) bindings[16];
        this.buttonNine = (android.widget.Button) bindings[5];
        this.buttonOne = (android.widget.Button) bindings[9];
        this.buttonSeven = (android.widget.Button) bindings[3];
        this.buttonSix = (android.widget.Button) bindings[8];
        this.buttonSubtract = (android.widget.Button) bindings[17];
        this.buttonThree = (android.widget.Button) bindings[11];
        this.buttonTwo = (android.widget.Button) bindings[10];
        this.buttonZero = (android.widget.Button) bindings[13];
        this.editText = (android.widget.EditText) bindings[2];
        this.infoTextView = (android.widget.TextView) bindings[1];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.parth.calc.android.R.layout.activity_main, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.parth.calc.android.R.layout.activity_main, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityMainBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityMainBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityMainBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}