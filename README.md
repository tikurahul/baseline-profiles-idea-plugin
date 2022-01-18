<!-- Plugin description -->
# Android Baseline Profiles

Baseline Profiles provide a way for developers to add rules and
bundle [Android Runtime (ART)](https://source.android.com/devices/tech/dalvik)
profile information into the APK.

These rules can be used during installation to pre-compile critical paths to machine code.
This is a form of profile guided optimization (PGO) that lets apps optimize startup, reduce jank,
and improve performance for end users.

Profile rules are compiled into a binary form in the APK, in `assets/dexopt/baseline.prof`.

During installation, ART performs Ahead-of-time (AOT) compilation on methods
listed in the profile, resulting in those methods executing faster. If the
profile contains methods used in app launch or during frame rendering,
the user will experience faster launch times and/or reduced jank.

App developers should consider defining Baseline Profiles to cover
specific hot paths during critical journeys where rendering time or latency
are important, such as startup, transitions or scrolling.

Library developers should consider adding Baseline Profiles to cover
_hot code_ or code commonly in an app.


## Plugin Features

* Syntax highlighting and validation for `baseline-prof.txt` files.
* Module aware completion for Kotlin and Java Files for Class descriptors.

### Syntax Highlight `baseline-prof.txt` files.

![Annotations](assets/annotations.png)

### Class Descriptor completions

![Class Completions](assets/completions.gif)
<!-- Plugin description end -->
