
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/service_worker/service_worker_fetch_response_callback.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface ServiceWorkerFetchResponseCallback extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends ServiceWorkerFetchResponseCallback, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<ServiceWorkerFetchResponseCallback, ServiceWorkerFetchResponseCallback.Proxy> MANAGER = ServiceWorkerFetchResponseCallback_Internal.MANAGER;


    void onResponse(
FetchApiResponse response, org.chromium.mojo_base.mojom.Time dispatchEventTime);



    void onResponseStream(
FetchApiResponse response, ServiceWorkerStreamHandle bodyAsStream, org.chromium.mojo_base.mojom.Time dispatchEventTime);



    void onFallback(
org.chromium.mojo_base.mojom.Time dispatchEventTime);


}