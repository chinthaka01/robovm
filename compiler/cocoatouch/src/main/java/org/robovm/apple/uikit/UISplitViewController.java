/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.uikit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UISplitViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UISplitViewControllerPtr extends Ptr<UISplitViewController, UISplitViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UISplitViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UISplitViewController() {}
    protected UISplitViewController(Handle h, long handle) { super(h, handle); }
    protected UISplitViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNibName:bundle:")
    public UISplitViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super(nibNameOrNil, nibBundleOrNil); }
    @Method(selector = "initWithCoder:")
    public UISplitViewController(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "viewControllers")
    public native NSArray<UIViewController> getViewControllers();
    @Property(selector = "setViewControllers:")
    public native void setViewControllers(NSArray<UIViewController> v);
    @Property(selector = "delegate")
    public native UISplitViewControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UISplitViewControllerDelegate v);
    @Property(selector = "presentsWithGesture")
    public native boolean presentsWithGesture();
    @Property(selector = "setPresentsWithGesture:")
    public native void setPresentsWithGesture(boolean v);
    @Property(selector = "isCollapsed")
    public native boolean isCollapsed();
    @Property(selector = "preferredDisplayMode")
    public native UISplitViewControllerDisplayMode getPreferredDisplayMode();
    @Property(selector = "setPreferredDisplayMode:")
    public native void setPreferredDisplayMode(UISplitViewControllerDisplayMode v);
    @Property(selector = "displayMode")
    public native UISplitViewControllerDisplayMode getDisplayMode();
    @Property(selector = "displayModeButtonItem")
    public native UIBarButtonItem getDisplayModeButtonItem();
    @Property(selector = "preferredPrimaryColumnWidthFraction")
    public native @MachineSizedFloat double getPreferredPrimaryColumnWidthFraction();
    @Property(selector = "setPreferredPrimaryColumnWidthFraction:")
    public native void setPreferredPrimaryColumnWidthFraction(@MachineSizedFloat double v);
    @Property(selector = "minimumPrimaryColumnWidth")
    public native @MachineSizedFloat double getMinimumPrimaryColumnWidth();
    @Property(selector = "setMinimumPrimaryColumnWidth:")
    public native void setMinimumPrimaryColumnWidth(@MachineSizedFloat double v);
    @Property(selector = "maximumPrimaryColumnWidth")
    public native @MachineSizedFloat double getMaximumPrimaryColumnWidth();
    @Property(selector = "setMaximumPrimaryColumnWidth:")
    public native void setMaximumPrimaryColumnWidth(@MachineSizedFloat double v);
    @Property(selector = "primaryColumnWidth")
    public native @MachineSizedFloat double getPrimaryColumnWidth();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "primaryEdge")
    public native UISplitViewControllerPrimaryEdge getPrimaryEdge();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setPrimaryEdge:")
    public native void setPrimaryEdge(UISplitViewControllerPrimaryEdge v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "primaryBackgroundStyle")
    public native UISplitViewControllerBackgroundStyle getPrimaryBackgroundStyle();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setPrimaryBackgroundStyle:")
    public native void setPrimaryBackgroundStyle(UISplitViewControllerBackgroundStyle v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="UISplitViewControllerAutomaticDimension", optional=true)
    public static native @MachineSizedFloat double getAutomaticDimension();
    
    @Method(selector = "showViewController:sender:")
    public native void showViewController(UIViewController vc, NSObject sender);
    @Method(selector = "showDetailViewController:sender:")
    public native void showDetailViewController(UIViewController vc, NSObject sender);
    /*</methods>*/
}
