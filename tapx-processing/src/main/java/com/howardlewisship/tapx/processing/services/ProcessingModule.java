// Copyright 2010 Howard M. Lewis Ship
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.howardlewisship.tapx.processing.services;

import org.apache.tapestry5.ioc.Configuration;
import org.apache.tapestry5.ioc.MappedConfiguration;
import org.apache.tapestry5.ioc.annotations.Contribute;
import org.apache.tapestry5.ioc.services.FactoryDefaults;
import org.apache.tapestry5.ioc.services.SymbolProvider;
import org.apache.tapestry5.services.ComponentClassResolver;
import org.apache.tapestry5.services.LibraryMapping;

public class ProcessingModule
{
    @Contribute(ComponentClassResolver.class)
    public static void extendTapxLibraryMapping(Configuration<LibraryMapping> configuration)
    {
        configuration.add(new LibraryMapping("tapx", "com.howardlewisship.tapx.processing"));
    }

    @Contribute(SymbolProvider.class)
    @FactoryDefaults
    public static void defineProcessingLibraryLocation(MappedConfiguration<String, String> configuration)
    {
        configuration.add("tapx.processing", "classpath:com/howardlewisship/tapx/processing/processing-0.9.7.js");
    }
}
