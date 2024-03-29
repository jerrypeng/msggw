package io.streaml.mltable;

/*
 * Copyright 2019 Streamlio, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import org.apache.bookkeeper.client.api.BookKeeper;
import org.apache.bookkeeper.mledger.ManagedLedgerFactory;

public interface MLTableBuilder {
    MLTableBuilder withTableName(String tableName);
    MLTableBuilder withExecutor(ExecutorService executor);
    MLTableBuilder withManagedLedgerFactory(ManagedLedgerFactory factory);
    MLTableBuilder withSnapshotAfterNUpdates(int numUpdates);
    MLTableBuilder withBookKeeperClient(BookKeeper bkc);
    CompletableFuture<MLTable> build();
}
