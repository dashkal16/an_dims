/*
 * Miasma Minecraft Mod
 * Copyright © 2021 Dashkal <dashkal@darksky.ca>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package name.dashkal.an_dims;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forgespi.language.IModInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Mod class for Ars Nouveau: Dimensions
 */
@Mod(ANDimsMod.MODID)
public class ANDimsMod
{
    public static final String MODID = "an_dims";
    private static final Logger LOGGER = LogManager.getLogger();
    private static IModInfo modInfo;

    public ANDimsMod() {
        LOGGER.info("Mod Initialization");

        // Save our mod information
        modInfo = ModLoadingContext.get().getActiveContainer().getModInfo();

        // Configuration
        // ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CommonConfig.INSTANCE.getConfig());

        // Common setup
        // CommonSetup.init();

        // Client setup
        // DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> ClientSetup::init);
    }

    /** Returns the version of the Mod */
    public static String getModVersion() {
        return modInfo.getVersion().toString();
    }
}
