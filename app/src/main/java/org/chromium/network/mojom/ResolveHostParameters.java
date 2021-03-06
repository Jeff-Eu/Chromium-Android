
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/host_resolver.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class ResolveHostParameters extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 24;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

    public static final class DnsQueryType {


        public static final int UNSPECIFIED = 0;

        public static final int A = UNSPECIFIED + 1;

        public static final int AAAA = A + 1;


        private static final boolean IS_EXTENSIBLE = false;

        public static boolean isKnownValue(int value) {
            switch (value) {
                case 0:
                case 1:
                case 2:
                    return true;
            }
            return false;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value))
                return;

            throw new DeserializationException("Invalid enum value.");
        }

        private DnsQueryType() {}

    }
    public int dnsQueryType;
    public int initialPriority;
    public org.chromium.mojo.bindings.InterfaceRequest<ResolveHostHandle> controlHandle;
    public boolean includeCanonicalName;
    public boolean loopbackOnly;
    public boolean isSpeculative;

    private ResolveHostParameters(int version) {
        super(STRUCT_SIZE, version);
        this.dnsQueryType = (int) ResolveHostParameters.DnsQueryType.UNSPECIFIED;
        this.initialPriority = (int) RequestPriority.LOWEST;
        this.includeCanonicalName = (boolean) false;
        this.loopbackOnly = (boolean) false;
        this.isSpeculative = (boolean) false;
    }

    public ResolveHostParameters() {
        this(0);
    }

    public static ResolveHostParameters deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static ResolveHostParameters deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static ResolveHostParameters decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        ResolveHostParameters result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new ResolveHostParameters(elementsOrVersion);
                {
                    
                result.dnsQueryType = decoder0.readInt(8);
                    ResolveHostParameters.DnsQueryType.validate(result.dnsQueryType);
                }
                {
                    
                result.initialPriority = decoder0.readInt(12);
                    RequestPriority.validate(result.initialPriority);
                }
                {
                    
                result.controlHandle = decoder0.readInterfaceRequest(16, true);
                }
                {
                    
                result.includeCanonicalName = decoder0.readBoolean(20, 0);
                }
                {
                    
                result.loopbackOnly = decoder0.readBoolean(20, 1);
                }
                {
                    
                result.isSpeculative = decoder0.readBoolean(20, 2);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.dnsQueryType, 8);
        
        encoder0.encode(this.initialPriority, 12);
        
        encoder0.encode(this.controlHandle, 16, true);
        
        encoder0.encode(this.includeCanonicalName, 20, 0);
        
        encoder0.encode(this.loopbackOnly, 20, 1);
        
        encoder0.encode(this.isSpeculative, 20, 2);
    }
}