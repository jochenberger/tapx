// Copyright 2009 Formos
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.formos.tapestry.tapx.plainmessage.services;

import com.formos.tapestry.tapx.plainmessage.internal.services.MessageScrubberImpl;
import com.formos.tapestry.tapx.plainmessage.internal.services.PlainMessageBindingFactory;
import org.apache.tapestry5.ioc.MappedConfiguration;
import org.apache.tapestry5.ioc.ServiceBinder;
import org.apache.tapestry5.ioc.annotations.Local;
import org.apache.tapestry5.services.BindingFactory;

public class PlainMessageModule
{
    public static void bind(ServiceBinder binder)
    {
        binder.bind(MessageScrubber.class, MessageScrubberImpl.class);
        binder.bind(BindingFactory.class, PlainMessageBindingFactory.class).withId("PlainMessageBindingFactory");
    }

    public static void contributeBindingSource(MappedConfiguration<String, BindingFactory> configuration,
                                               @Local BindingFactory factory)
    {
        configuration.add("plain", factory);
    }
}
