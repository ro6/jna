package com.sun.jna.platform.win32.COM;

import com.sun.jna.platform.win32.Guid.IID;
import com.sun.jna.platform.win32.Guid.REFIID;
import com.sun.jna.platform.win32.WTypes.BSTR;
import com.sun.jna.platform.win32.WinDef.DWORD;
import com.sun.jna.platform.win32.WinNT.HRESULT;
import com.sun.jna.ptr.PointerByReference;

public interface IClassFactory2 extends IUnknown {

	public static final IID IID_IClassFactory2 = new IID("{B196B28F-BAB4-101A-B69C-00AA00341D07}");

	HRESULT CreateInstanceLic(PointerByReference pUnkOuter, PointerByReference pUnkReserved, REFIID riid, BSTR bstrKey,
			PointerByReference ppvObj);

	HRESULT GetLicInfo(PointerByReference pLicInfo);

	HRESULT RequestLicKey(DWORD dwReserved, BSTR pBstrKey);
}
